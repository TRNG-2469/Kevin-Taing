create table inventory(
item_id int primary key, 
item_name varchar(30) not null, 
quantity int not null,
last_updated timestamp default current_timestamp
);

insert into inventory(item_id, item_name, quantity) values (1, 'Keyboard', 2);
select * from inventory;

create or replace function fn_sync_last_updated() returns trigger
language plpgsql as $$ begin
	new.last_updated:= now()
	return new;
end $$

create trigger trg_inventory_update_timestamp before update on inventory for each row execute function fn_sync_last_updated();

select * from inventory;


-- Create the inventory_audit_log table. Write a trigger such that, whenever you update something, the inventory_update_log is updated with the changes as well.

CREATE TABLE inventory_audit_log (
    log_id SERIAL PRIMARY KEY,
    item_id INT NOT NULL,
    action_type VARCHAR(10) NOT NULL,
    old_quantity INT,
    new_quantity INT,
    changed_by VARCHAR(50) DEFAULT CURRENT_USER,
    changed_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

create or replace function fn_inventory_update_log() returns trigger language plpgsql as $$ begin
	insert into inventory_audit_log(item_id, action_type, old_quantity, new_quantity) values (new.item_id, 'UPDATE', old.quantity, new.quantity);
	return new;
end $$;


create trigger trg_inventory_update_log_update after update on inventory for each row execute function fn_inventory_update_log();