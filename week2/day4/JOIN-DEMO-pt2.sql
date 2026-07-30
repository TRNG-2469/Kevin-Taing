create table customers(
customer_id int primary key,
name varchar(50) not null
);

create table orders(
order_id int primary key, 
customer_id int references customers(customer_id),
amount decimal (10, 2) not null 
);

insert into customers values(1, 'Alice'), (2, 'Bob'), (3, 'Charlie');
insert into orders values(101, 1, 300.50), (102, 1, 234.5);

select c.name, o.order_id, o.amount
from customers c
left join orders o
on c.customer_id = o.customer_id;