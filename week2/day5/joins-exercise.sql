select m.name, b.title, l.loan_date from members m inner join loans l on m.member_id = l.member_id inner join books b on l.book_id = b.book_id;

select m.name, l.loan_date from members m left join loans l on m.member_id = l.member_id;

select m.name, l.loan_date from members m left join loans l on m.member_id = l.member_id where l.loan_date is not null;

select m.name, b.title, b.author, l.loan_date from members m inner join loans l on m.member_id = l.member_id inner join books b on l.book_id = b.book_id;

select m.name, m.email, b.title, l.loan_date from members m inner join loans l on m.member_id = l.member_id inner join books b on l.book_id = b.book_id where l.loan_date < '2026-07-01';