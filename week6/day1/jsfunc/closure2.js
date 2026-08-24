function createBankAccount() {
    let balance = 0;

    return {
        deposit(amount) {balance += amount;}, 
        getBalance() {
            return balance;
        }
    }
}

const account = createBankAccount();
account.deposit(100);
console.log(account.getBalance());