CREATE TABLE departments (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(50) NOT NULL
);

CREATE TABLE staff (
    staff_id INT PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    salary DECIMAL(10, 2) NOT NULL,
    dept_id INT REFERENCES departments(dept_id)
);

INSERT INTO departments VALUES (10, 'Engineering'), (20, 'Sales');
INSERT INTO staff VALUES 
(1, 'Alice', 'Smith', 95000.00, 10),
(2, 'Bob', 'Jones', 60000.00, 20),
(3, 'Charlie', 'Brown', 110000.00, 10);

create view v_staff_dept as select s.staff_id, s.first_name, s.last_name, d.dept_name from staff s join departments d on s.dept_id = d.dept_id