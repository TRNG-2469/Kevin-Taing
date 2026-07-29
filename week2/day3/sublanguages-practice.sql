alter table books add category varchar(30);

insert into members values (2003, 'Bobby Hill', 'bobsterhillster@gmail.com');

select * from books where author = 'George Orwell';

begin;
insert into members values (2004, 'Hank Hill', 'hanksterhillster@gmail.com');
savepoint insert_check;
update members set name = 'Bart Simpson', email = 'bartstersimponster@gmail.com' where member_id = 2004;
rollback to savepoint insert_check;
commit;

create role guest_reader;
grant select on books to guest_reader;