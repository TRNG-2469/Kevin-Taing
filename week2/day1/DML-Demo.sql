-- Perform DML -- insert, update and delte

-- before DML make sure you have a table
create table customers(
customer_id int primary key, 
name varchar(50) not null, 
membership_tier varchar(20) default 'BRONZE'
)

-- Add some data to the table --- INSERT
-- single row
insert into customers(customer_id, name, membership_tier) values (1, 'Alice', 'GOLD');
-- insert multiple rows
insert into customers(customer_id, name, membership_tier) values (2, 'John Doe', 'GOLD'), (3, 'Mark', 'SILVER');

insert into customers(customer_id, name) values (4, "Jane Doe");

-- modify data -- update
update customers set membership_tier = 'GOLD' where customer_id = 4;

-- create/write an update statement to modify values of 2 columns
update customers set name = 'Kevin Taing', membership_tier = 'Silver' where customer_id = 2;

-- delete data -- delete
delete from customers where customer_id = 1;