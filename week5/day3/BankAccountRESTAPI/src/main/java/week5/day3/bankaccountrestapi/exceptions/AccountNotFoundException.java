package week5.day3.bankaccountrestapi.exceptions;

public class AccountNotFoundException extends RuntimeException{
    public AccountNotFoundException(int id) {
        super("Account not found with id: " + id);
    }
}
