-- TCL demo -- Commit, rollback and savepoint

begin transaction

update checking_accounts set balance = balance - 100 where account_id = 1;


-- some error happens

rollback;

--artial rollback -- savepoint

begin transaction;

update checking_accounts set balance = balance - 10 where account_id = 1;

savepoint amount_withdrawn

update checking_accounts set balance = balance + 10 where account_id = 99;

rollback to savepoint amount_withdrawn;

commit;