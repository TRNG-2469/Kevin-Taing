public class EmployeeProfile {
    private String employeeId;
    private String name;
    private double monthlySalary;

    public EmployeeProfile(String employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.monthlySalary = salary;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            return;
        }
        this.name = name;
    }

    public void setMonthlySalary(double monthlySalary) {
        if(monthlySalary < 0.0) {
            System.out.println("Error: A negative number can not be passed as a salary.");
            return;
        }
        this.monthlySalary = monthlySalary;
    }
}