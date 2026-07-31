select m.name from members m inner join loans l on m.member_id = l.member_id;
select name from members where member_id in (select member_id from loans);


select m.name, l.loan_date from members m left join loans l on m.member_id = l.member_id where l.loan_date is null;
select name from members where not member_id in (select member_id from loans);

-- The concrete joins are easier (at least for me) to read since layers of subqueries become confusing.
-- PostgreSQL produced similar execution plans with nearly identical performance.