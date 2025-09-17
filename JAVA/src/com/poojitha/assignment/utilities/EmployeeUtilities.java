package com.poojitha.assignment.utilities;

import com.poojitha.assignment.employees.Employee;

public class EmployeeUtilities {

    // Method to display employee details
    public void displayEmployeeInfo(Employee e) {
        System.out.println("Employee ID: " + e.getEmployeeId());
        System.out.println("Name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}
