package com.rev.jdbc.dao;

import com.rev.jdbc.model.Employee;
import com.rev.jdbc.utils.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    @Override
    public void create(Employee employee) {
        String createSQL = "INSERT INTO employee (name, salary, emp_id) VALUES (?, ?, ?)";
        try(Connection connection = ConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(createSQL)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setDouble(2, employee.getSalary());
            preparedStatement.setInt(3, employee.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Employee employee) {
        String updateSQL = "UPDATE employee SET name = ?, salary = ? WHERE emp_id = ?";
        try(Connection connection = ConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setDouble(2, employee.getSalary());
            preparedStatement.setInt(3, employee.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(int id) {
        String deleteSQL = "DELETE FROM employee WHERE emp_id = ?";
        try(Connection connection = ConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Employee findById(int id) {
        String findSQL = "SELECT * FROM employee WHERE emp_id = ?";
        try(Connection connection = ConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(findSQL)) {
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            if(rs.next()) {
                return new Employee(
                    rs.getInt("emp_id"),
                    rs.getString("name"),
                    rs.getDouble("salary")
                );
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public List<Employee> findAll() {
        String findAllSQL = "SELECT * FROM employee";
        try(Connection connection = ConnectionFactory.getInstance().getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(findAllSQL)) {
            ResultSet rs = preparedStatement.executeQuery();
            List<Employee> result = new ArrayList<>();
            while(rs.next()) {
                result.add(new Employee(
                        rs.getInt("emp_id"),
                        rs.getString("name"),
                        rs.getDouble("salary")
                ));
            }
            return result;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
