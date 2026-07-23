package com.rev.coll;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeManager {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Jon", 10000);
        Employee e2 = new Employee(2, "Surya", 11000);
        Employee e3 = new Employee(3, "Chris", 20000);
        Employee e4 = new Employee(4, "Hamza", 30000);
        Employee e5 = new Employee(5, "Veeksha", 40000);

        ArrayList<Employee> list = new ArrayList<>();

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        for(Employee e: list) {
            System.out.println(e);
        }

        Collections.sort(list);
    }
}
