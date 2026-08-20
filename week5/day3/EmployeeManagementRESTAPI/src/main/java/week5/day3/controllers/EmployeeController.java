package week5.day3.controllers;

import jakarta.websocket.server.PathParam;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import week5.day3.models.Employee;
import week5.day3.services.EmployeeService;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        List<Employee> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) {
        Employee employee = employeeService.getEmployeeById(id);
        if(employee == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employee);
    }

    @GetMapping("employees/email/{email}")
    public ResponseEntity<Employee> getEmployeebyEmail(@PathVariable String email) {
        Employee employee = employeeService.getEmployeebyEmail(email);
        if(employee == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(employee);
    }

    @GetMapping("/employees?department=?")
    public ResponseEntity<List<Employee>> getEmployeeByDepartment(@RequestParam String department) {
        List<Employee> employees = employeeService.getEmployeeByDepartment(department);
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employees?designation=?")
    public ResponseEntity<List<Employee>> getEmployeeByDesignation(@RequestParam String designation) {
        List<Employee> employees = employeeService.getEmployeeByDesignation(designation);
        return ResponseEntity.ok(employees);
    }

    @GetMapping("/employees?minSalary=?&maxSalary=?")
    public ResponseEntity<List<Employee>> getEmployeeBySalary(@RequestParam int min, @RequestParam int max) {
        List<Employee> employees = employeeService.getEmployeeBySalary(min, max);
        return ResponseEntity.ok(employees);
    }

    @PostMapping("/employees")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee studentCreated = employeeService.addEmployee(employee);
        return ResponseEntity.status(201).body(studentCreated);
    }

    @PutMapping("/students/{id}")
    public ResponseEntity<Employee> updateStudent(@PathVariable int id, @RequestBody Employee employee) {
        return ResponseEntity.status(200).body(employeeService.updateEmployee(id, employee));
    }

    @DeleteMapping("/students/{id}")
    public ResponseEntity<Employee> deleteStudent(@PathVariable int id) {
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }
}
