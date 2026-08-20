package week5.day3.exceptions;

public class EmployeeNotFoundException extends RuntimeException {
    public EmployeeNotFoundException(int id) {
        super("Employee with ID " + id + " not found.");
    }
}
