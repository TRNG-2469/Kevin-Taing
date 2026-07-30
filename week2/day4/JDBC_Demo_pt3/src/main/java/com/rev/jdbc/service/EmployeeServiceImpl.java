package com.rev.jdbc.service;

import com.rev.jdbc.dao.EmployeeDAO;
import com.rev.jdbc.dao.EmployeeDAOImpl;
import com.rev.jdbc.model.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public void create(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        if(findById(employee.getId()) != null ) {
            throw new IllegalArgumentException("Employee with id " + employee.getId() + " already exists");
        }
        if(employee.getName() == null || employee.getName().isEmpty() || employee.getSalary() <= 0) {
            throw new IllegalArgumentException("Employee name cannot be null or empty and salary must be greater than 0");
        }
        employeeDAO.create(employee);
    }

    @Override
    public void update(Employee employee) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        if(findById(employee.getId()) == null ) {
            throw new IllegalArgumentException("Employee with id " + employee.getId() + " does not exist");
        }
        if(employee.getName() == null || employee.getName().isEmpty() || employee.getSalary() <= 0) {
            throw new IllegalArgumentException("Employee name cannot be null or empty and salary must be greater than 0");
        }
        employeeDAO.update(employee);
    }

    @Override
    public void delete(int id) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        if(findById(id) == null ) {
            throw new IllegalArgumentException("Employee with id " + id + " does not exist");
        }
        employeeDAO.delete(id);
    }

    @Override
    public Employee findById(int id) {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        return employeeDAO.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        return employeeDAO.findAll();
    }
}
