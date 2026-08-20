package week5.day3.bankaccountrestapi.repositories;

import org.springframework.stereotype.Repository;
import week5.day3.bankaccountrestapi.enums.AccountType;
import week5.day3.bankaccountrestapi.models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    Account findByAccountNumber(int accountNumber);
    Account findByCustomerName(String customerName);
    List<Account> findByBranch(String branch);
    List<Account> findByAccountType(AccountType accountType);
    List<Account> findByBalance(double min, double max);
}
