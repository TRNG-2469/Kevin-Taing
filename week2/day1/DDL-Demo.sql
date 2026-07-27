-- Perform DDL commands -- create, alter, drop and truncate

-- create table
create table accounts(
account_id int primary key, 
owner_name varchar(50) not null, 
created_at timestamp default now()
)

-- Add another column --- ALTER
alter table accounts add column status varchar(20) default 'ACTIVE'

-- Modify a column -- ALTER
alter table accounts rename column owner_name to full_name

-- Delete all data retain the structure of table -- TRUNCATE
truncate table accounts;

-- Remove the table structure along with data -- DROP
drop table table1;