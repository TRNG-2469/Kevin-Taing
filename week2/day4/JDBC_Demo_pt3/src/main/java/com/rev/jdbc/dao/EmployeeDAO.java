package com.rev.jdbc.dao;

import com.rev.jdbc.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    // CRUD

    void create(Employee employee);
    void update(Employee employee);
    void delete(int id);

    // Read All, Read One
    Employee findById(int id);
    List<Employee> findAll();
}
