package week5.day3.bankaccountrestapi.services;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import week5.day3.bankaccountrestapi.enums.AccountType;
import week5.day3.bankaccountrestapi.exceptions.AccountNotFoundException;
import week5.day3.bankaccountrestapi.exceptions.AmountInvalid;
import week5.day3.bankaccountrestapi.exceptions.InsufficientBalanceException;
import week5.day3.bankaccountrestapi.models.Account;
import week5.day3.bankaccountrestapi.repositories.AccountRepository;

import java.util.List;

public class AccountService {
    //GET     /accounts
    //GET     /accounts/{id}
    //POST    /accounts
    //PUT     /accounts/{id}
    //DELETE  /accounts/{id}

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public Account getAccountById(int id) {
        return accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
    }

    public Account getAccountByNumber(int accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber);
    }

    public Account getAccountByCustomerName(String customerName) {
        return accountRepository.findByCustomerName(customerName);
    }

    public List<Account> getAccountByBranch(String branch) {
        return accountRepository.findByBranch(branch);
    }

    public List<Account> getAccountsByAccountType(String accountType) {
        return accountRepository.findByAccountType(AccountType.valueOf(accountType));
    }

    public List<Account> getAccountsByBalance(double min, double max) {
        return accountRepository.findByBalance(min, max);
    }

    public void deposit(int id, double amount) {
        if(amount <= 0) {
            throw new AmountInvalid("Amount cannot be zero or negative.");
        }
        Account account = accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
        account.setBalance(account.getBalance() + amount);
        accountRepository.save(account);
    }

    public boolean withdraw(int id, double amount) {
        Account account = accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
        if(account.getBalance() < amount) {
            throw new InsufficientBalanceException();
        }
        account.setBalance(account.getBalance() - amount);
        accountRepository.save(account);
        return true;
    }

    public Account addAccount(Account account) {
        return accountRepository.save(account);
    }

    public Account updateAccount(int id, Account account) {
        Account existingAccount = accountRepository.findById(id).orElseThrow(() -> new AccountNotFoundException(id));
        existingAccount.setAccountNumber(account.getAccountNumber());
        existingAccount.setCustomerName(account.getCustomerName());
        existingAccount.setCustomerEmail(account.getCustomerEmail());
        existingAccount.setAccountType(account.getAccountType());
        existingAccount.setBranch(account.getBranch());
        existingAccount.setBalance(account.getBalance());
        return accountRepository.save(existingAccount);
    }

    public boolean deleteAccount(int id) {
        if(accountRepository.existsById(id)) {
            accountRepository.deleteById(id);
            return true;
        } else {
            throw new AccountNotFoundException(id);
        }
    }
}
