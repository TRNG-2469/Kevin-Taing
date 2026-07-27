-- DQL -- select
-- All columns and rows
select * from employees;

-- one column
select first_name from employees;

-- alias the column name
select first_name as "First Name" from employees;

-- multiple columns
select first_name as "First Name", salary as "Base Salary" from employees;

-- filter columns
select first_name as "First Name", salary as "Base Salary" from employees where department = 'Engineering' and salary > 100000 order by salary desc limit 2;