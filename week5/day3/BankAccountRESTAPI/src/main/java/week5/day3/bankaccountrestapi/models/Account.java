package week5.day3.bankaccountrestapi.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import week5.day3.bankaccountrestapi.enums.AccountType;

@Entity
@Table(name = "tbl_accounts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    int id;
    @Positive(message = "Account number must be greater than 0")
    int accountNumber;
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
    String customerName;
    @Email(message = "Email should be valid")
    String customerEmail;
    @NotBlank(message = "Account type is mandatory")
    AccountType accountType;
    @NotBlank(message = "Branch is mandatory")
    String branch;
    @Positive(message = "Balance must be greater than 0")
    double balance;
}
