create table books (
book_id int primary key,
title varchar(100), 
author varchar(100)
)

create table members ( 
member_id int primary key,
name varchar(100), 
email varchar(100) unique
)

create table loans ( 
member_id int references members(member_id),
book_id int references books(book_id),
loan_date timestamp default now(), 
primary key (member_id, book_id, loan_date),
due_date timestamp
)

INSERT INTO books VALUES (101, 'The Hobbit', 'J.R.R. Tolkien'), (102, '1984', 'George Orwell');
INSERT INTO members VALUES (5001, 'John Doe', 'john@email.com'), (5002, 'Jane Smith', 'jane@email.com');

--INSERT INTO loans (member_id, book_id, loan_date)
--VALUES (9999, 101, '2026-07-12');

--INSERT INTO members VALUES (5003, 'Alex Jones', 'john@email.com');