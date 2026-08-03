DROP TABLE IF EXISTS bank_accounts CASCADE;

CREATE TABLE bank_accounts (
    account_id INT PRIMARY KEY,
    owner_name VARCHAR(100) NOT NULL,
    balance DECIMAL(12, 2) NOT NULL,
    CONSTRAINT chk_positive_balance CHECK (balance >= 0.00)
);

INSERT INTO bank_accounts (account_id, owner_name, balance) VALUES 
(101, 'David Miller', 500.00),
(102, 'Emily Davis', 150.00);

select * from bank_accounts;

begin;
	update bank_accounts set balance = balance - 100.00 where account_id = 101;
	update bank_accounts set balance = balance + 100.00 where account_id = 102;
commit;

select * from bank_accounts;

begin;
	update bank_accounts set balance = balance - 600.00 where account_id = 101;
	update bank_accounts set balance = balance + 600.00 where account_id = 102;
rollback;

select * from bank_accounts;

INSERT INTO bank_accounts (account_id, owner_name, balance) VALUES (103, 'David Vault', 0.00);

start transaction;
savepoint vault_created;
	update bank_accounts set balance = balance - 300.00 where account_id = 101;
	update bank_accounts set balance = balance + 300.00 where account_id = 103;
rollback to vault_created;
commit;

select * from bank_accounts;