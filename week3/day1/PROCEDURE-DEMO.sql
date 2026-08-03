create table client_accounts(
account_id int primary key, 
owner_name varchar(30) not null,
balance decimal(10, 2) not null, 
status varchar(20) default 'ACTIVE'
)

insert into client_accounts values
(1, 'Alice', 1000, 'ACTIVE'), 
(2, 'Bob', 500.50, 'ACTIVE');

-- Creating procedure
create or replace procedure pr_transfer_funds(
sender_id int, 
receiver_id int,
amount decimal
)
language plpgsql 
as $$
begin
	update client_accounts set balance = balance - amount where account_id = sender_id;
	update client_accounts set balance = balance + amount where account_id = receiver_id;
	commit;
end;
$$;

-- execute
call pr_transfer_funds(1, 2, 150);
select * from client_accounts

--demo for out params
create or replace procedure pr_get_account_details(
account_id int, 
acc_owner varchar, 
acc_bal decimal
)
language plpgsql
as $$
begin
	select owner_name, balance into acc_owner, acc_bal from client_accounts where account_id = acc_id;
end;
$$;

-- procedure with single variable as in and out
create or replace procedure pr_increment_bal(id int, bal decimal) language plpgsql as $$
begin 
	update client_accounts set balance = balance - bal where account_id = id;
	select balance into bal from client_accounts where account_id = id;
end $$;

