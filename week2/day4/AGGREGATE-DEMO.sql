create table orders(
order_id int primary key, 
customer_id int not null,
department varchar(50) not null, 
amount decimal(10, 2) not null
)

insert into orders values(1, 10, 'Electronics', 150.00), (2, 10, 'Electronics', 200), (3, 10, 'Books', 300), (4, 10, 'Books', 35), (5, 10, 'Electronics', 175), (6, 10, 'Furniture', 300)

select count(order_id) as "Total Orders", sum(amount) as "Total Amount", avg(amount) as "Average", max(amount) as "Max Amount", min(amount) as "Min Amount" from orders;

select upper(department), length(department) as "Total Characters" from orders;

select department, count(order_id) as "Total Order", sum(amount) as "Total Amount" from orders group by department having sum(amount) > 300;