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

alter table books add published_year int check (published_year >= 1450 and published_year <= extract(year from current_date));

alter table members add membership_status varchar(20) default 'ACTIVE' check (membership_status in ('ACTIVE', 'SUSPENDED', 'EXPIRED'));

alter table loans drop constraint loans_book_id_fkey, drop constraint loans_member_id_fkey;
alter table loans add constraint fk_loans_books foreign key (book_id) references books(book_id) on delete cascade;
alter table loans add constraint fk_loans_members foreign key (member_id) references members(member_id) on delete restrict;