DROP TABLE IF EXISTS order_items CASCADE;
DROP TABLE IF EXISTS orders CASCADE;
DROP TABLE IF EXISTS customers CASCADE;
DROP TABLE IF EXISTS customer_audit_log CASCADE;

CREATE TABLE customers (
    customer_id SERIAL PRIMARY KEY,
    full_name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT REFERENCES customers(customer_id) ON DELETE CASCADE,
    order_date DATE NOT NULL,
    status VARCHAR(20) NOT NULL, -- 'PENDING', 'COMPLETED', 'ARCHIVED'
    total_amount DECIMAL(10, 2) DEFAULT 0.00
);

CREATE TABLE customer_audit_log (
    log_id SERIAL PRIMARY KEY,
    customer_id INT,
    old_name VARCHAR(100),
    new_name VARCHAR(100),
    changed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Seed initial data
INSERT INTO customers (full_name, email) VALUES 
('John Doe', 'john.doe@example.com'),
('Jane Smith', 'jane.smith@example.com');

INSERT INTO orders (order_id, customer_id, order_date, status, total_amount) VALUES
(5001, 1, '2026-07-01', 'PENDING', 250.00),
(5002, 1, '2026-07-10', 'COMPLETED', 120.00),
(5003, 2, '2026-07-12', 'PENDING', 45.00),
(5004, 2, '2026-06-15', 'COMPLETED', 300.00);

create view v_active_orders as select o.order_id, o.order_date, o.total_amount, c.full_name, c.email from orders o inner join customers c on o.customer_id = c.customer_id;
select * from v_active_orders;

create or replace function fn_log_customer_name_change() returns trigger language plpgsql as $$ begin
	insert into customer_audit_log (customer_id, old_name, new_name) values (new.customer_id, old.full_name, new.full_name);
	return new;
end $$;

create trigger tr_fn_log_customer_name_change after update on customers for each row execute function fn_log_customer_name_change();

select * from customer_audit_log;
update customers set full_name = 'Johnathan Doe' where full_name = 'John Doe';
select * from customer_audit_log;

create or replace procedure pr_archive_old_orders(cutoff_date date) language plpgsql as $$ begin
	update orders set status = 'ARCHIVED' where status = 'COMPLETED' and order_date < cutoff_date;
	commit;
end $$;

call pr_archive_old_orders('2026-07-05');
select * from orders;

