public class HRApp {
    public static void main(String[] args) {
        EmployeeProfile ep = new EmployeeProfile("123", "John Doe", 5000.0);
        System.out.println("Employee ID: " + ep.getEmployeeId());
        System.out.println("Employee Name: " + ep.getName());
        System.out.println("Employee Salary: " + ep.getMonthlySalary());

        ep.setMonthlySalary(-5000.00);
        System.out.println("Employee Salary: " + ep.getMonthlySalary());
        ep.setName(null);
        System.out.println("Employee Name: " + ep.getName());
    }
}
