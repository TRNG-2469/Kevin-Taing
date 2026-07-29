create table departments(
dept_id int primary key,
name varchar(25) not null
)

insert into departments values(101, 'IT')

create table employees(
emp_id int primary key, 
name varchar(30) not null, 
dept_id int references departments(dept_id) 
)

insert into employees values (1, 'Alice', 101)
insert into employees employees values(2, 'Bob' 102)