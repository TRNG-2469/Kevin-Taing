package week5.day3.bankaccountrestapi.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import week5.day3.bankaccountrestapi.models.Account;
import week5.day3.bankaccountrestapi.services.AccountService;

import java.util.List;

@RestController
public class AccountController {
    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public ResponseEntity<List<Account>> getAllAccounts() {
        List<Account> accounts = accountService.getAllAccounts();
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/accounts/{id}")
    public ResponseEntity<Account> getAccountById(@PathVariable int id) {
        Account account = accountService.getAccountById(id);
        if(account == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(account);
    }

    @GetMapping("/accounts/number/{accountNumber}")
    public ResponseEntity<Account> getAccountByNumber(@PathVariable int accountNumber) {
        Account account = accountService.getAccountByNumber(accountNumber);
        if(account == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(account);
    }

    @GetMapping("/accounts?customerName=?")
    public ResponseEntity<Account> getAccountByCustomerName(@RequestParam String customerName) {
        Account account = accountService.getAccountByCustomerName(customerName);
        if(account == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(account);
    }

    @GetMapping("/accounts?branch=?")
    public ResponseEntity<List<Account>> getAccountsByBranch(@RequestParam String branch) {
        List<Account> account = accountService.getAccountByBranch(branch);
        return ResponseEntity.ok(account);
    }

    @GetMapping("/accounts?accountType=?")
    public ResponseEntity<List<Account>> getAccountsByAccountType(@RequestParam String accountType) {
        List<Account> accounts = accountService.getAccountsByAccountType(accountType);
        return ResponseEntity.ok(accounts);
    }

    @GetMapping("/accounts?minBalance=?&maxBalance=?")
    public ResponseEntity<List<Account>> getAccountsByBalance(@RequestParam double minBalance, @RequestParam double maxBalance) {
        List<Account> accounts = accountService.getAccountsByBalance(minBalance, maxBalance);
        return ResponseEntity.ok(accounts);
    }

    @PostMapping("/accounts/{id}/deposit?amount=?")
    public ResponseEntity<Account> deposit(@PathVariable int id, @RequestParam double amount) {
        accountService.deposit(id, amount);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/accounts/{id}/withdraw?amount=?")
    public ResponseEntity<Account> withdraw(@PathVariable int id, @RequestParam double amount) {
        if(accountService.withdraw(id, amount)) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping("/accounts")
    public ResponseEntity<Account> addAccount(@RequestBody Account account) {
        Account accountCreated = accountService.addAccount(account);
        return ResponseEntity.status(201).body(accountCreated);
    }

    @PutMapping("/accounts/{id}")
    public ResponseEntity<Account> updateAccount(@PathVariable int id, @RequestBody Account account) {
        return ResponseEntity.status(200).body(accountService.updateAccount(id, account));
    }

    @DeleteMapping("/accounts/{id}")
    public ResponseEntity<Account> deleteAccount(@PathVariable int id) {
        if(accountService.deleteAccount(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}
