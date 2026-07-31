select name, salary from employees where salary > (select avg(salary) from employees)

create index idx_emp_first_name on employees(first_name)