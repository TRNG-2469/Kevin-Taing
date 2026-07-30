package com.rev.jdbc;

import com.rev.jdbc.model.Employee;
import com.rev.jdbc.service.EmployeeService;
import com.rev.jdbc.service.EmployeeServiceImpl;

public class MainClass {
    public static void main(String[] args) {
        Employee employee = new Employee(5, "", -111);
        EmployeeService service = new EmployeeServiceImpl();
        service.update(employee);
    }
}
