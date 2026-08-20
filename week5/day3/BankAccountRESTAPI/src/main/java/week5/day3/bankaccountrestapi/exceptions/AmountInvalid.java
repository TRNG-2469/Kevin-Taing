package week5.day3.bankaccountrestapi.exceptions;

public class AmountInvalid extends RuntimeException {
    public AmountInvalid(String message) {
        super(message);
    }
}
