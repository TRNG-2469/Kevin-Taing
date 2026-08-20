package week5.day3.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import week5.day3.models.Employee;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    public EmployeeService() {
        employees.add(new Employee(101, "Rahul Sharma", "Rahul@Sharma.com", "IT", "Developer", 65000));
        employees.add(new Employee(102, "Priya Singh", "Priya@Singh.com", "HR", "Manager", 75000));
        employees.add(new Employee(103, "Amit Verma", "Amit@Verma.com", "IT", "Tester", 55000));
        employees.add(new Employee(104, "Sneha Patel", "Sneha@Patel.com", "Finance", "Accountant", 60000));
        employees.add(new Employee(105, "Arjun Mehta", "Arjun@Mehta.com", "IT", "Manager", 90000));
        employees.add(new Employee(106, "Neha Gupta", "Neha@Gupta.com", "HR", "Recruiter", 45000));
    }

    public List<Employee> getAllEmployees() {
        return employees;
    }

    public Employee getEmployeeById(int id) {
        for(Employee employee: employees) {
            if(employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public Employee getEmployeebyEmail(String email) {
        for(Employee employee: employees) {
            if(employee.getEmail().equals(email)) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> getEmployeeByDepartment(String department) {
        List<Employee> resultEmployees = new ArrayList<>();
        for(Employee employee: employees) {
            if(employee.getDepartment().equals(department)) {
                resultEmployees.add(employee);
            }
        }
        return resultEmployees;
    }

    public List<Employee> getEmployeeByDesignation(String designation) {
        List<Employee> resultEmployees = new ArrayList<>();
        for(Employee employee: employees) {
            if(employee.getDesignation().equals(designation)) {
                resultEmployees.add(employee);
            }
        }
        return resultEmployees;
    }

    public List<Employee> getEmployeeBySalary(int min, int max) {
        List<Employee> resultEmployees = new ArrayList<>();
        for(Employee employee: employees) {
            if(employee.getSalary() >= min && employee.getSalary() <= max) {
                resultEmployees.add(employee);
            }
        }
        return resultEmployees;
    }

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee updateEmployee(int id, Employee employee) {
        for(int i = 0; i <employees.size(); i++) {
            Employee updatedEmployee = employees.get(i);
            if(updatedEmployee.getId() == id) {
                updatedEmployee.setId(employee.getId());
                updatedEmployee.setName(employee.getName());
                updatedEmployee.setEmail(employee.getEmail());
                updatedEmployee.setDepartment(employee.getDepartment());
                updatedEmployee.setDesignation(employee.getDesignation());
                updatedEmployee.setSalary(employee.getSalary());
                return updatedEmployee;
            }
        }
        return null;
    }

    public Employee deleteEmployee(int id) {
        for(int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if(employee.getId() == id) {
                employees.remove(i);
                return employee;
            }
        }
        return null;
    }
}
