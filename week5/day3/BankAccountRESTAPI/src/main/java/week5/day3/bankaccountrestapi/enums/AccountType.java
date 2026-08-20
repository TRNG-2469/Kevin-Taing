package week5.day3.bankaccountrestapi.enums;

public enum AccountType {
    SAVINGS("savings"),
    CURRENT("current");

    private final String dbValue;

    AccountType(String dbValue) {
        this.dbValue = dbValue;
    }

    public String getDbValue() {
        return dbValue;
    }
}
