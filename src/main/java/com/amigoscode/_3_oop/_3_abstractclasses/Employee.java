package com.amigoscode._3_oop._3_abstractclasses;

import java.util.Arrays;
import java.util.List;

/**
 * Exercise: Abstract Classes - Employee Hierarchy
 * <p>
 * Build an employee hierarchy using abstract classes. The abstract Employee
 * defines common behavior, while FullTimeEmployee and ContractEmployee
 * provide different pay calculation strategies.
 * <p>
 * Key concepts:
 * - Abstract class with both abstract and concrete methods
 * - Multiple subclasses with different implementations
 * - Polymorphism with a List of the abstract type
 * - Inner classes (classes defined in the same file)
 */

//  1 - Make the Employee class abstract. Add two protected fields:
//   - name (String)
//   - baseSalary (double)
//   Create a constructor that takes both fields and assigns them.
abstract class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    //  2 - Declare an abstract method: double calculatePay()
    //   Each subclass will compute pay differently.
    abstract double calculatePay();

    //  3 - Create a concrete method: String getDetails()
    //   Return: "<name> - Pay: $<calculatePay()>"
    //   Use String.format("%.2f", calculatePay()) for formatting.
    String getDetails() {
        return String.format("%s - Pay: $%.2f", name, calculatePay());
    }
}

//  4 - Create a FullTimeEmployee class that extends Employee.
//   - Constructor takes name and baseSalary, calls super(name, baseSalary)
//   - Implement calculatePay() to simply return baseSalary
class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    double calculatePay() {
        return baseSalary;
    }
}

//  5 - Create a ContractEmployee class that extends Employee.
//   - Add two private fields: hourlyRate (double) and hoursWorked (int)
//   - Constructor takes name, hourlyRate, and hoursWorked
//     (pass name and 0.0 as baseSalary to super)
//   - Implement calculatePay() to return hourlyRate * hoursWorked
class ContractEmployee extends Employee {
    private final double hourlyRate;
    private final int hoursWorked;

    public ContractEmployee(String name, double hourlyRate, int hoursWorked) {
        super(name, 0.0);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculatePay() {
        return hourlyRate * hoursWorked;
    }
}

//  6 - In the EmployeeDemo class below, complete the main method:
//   - Create a List<Employee> with at least one FullTimeEmployee
//     and one ContractEmployee
//   - Iterate over the list and print getDetails() for each employee

//  7 - Add a method in EmployeeDemo: static Employee getHighestPaid(List<Employee> employees)
//   that returns the employee with the highest calculatePay() value.
//   Call it from main and print the result.

class EmployeeDemo {
    static void main(String[] args) {
        // Complete TODOs 6 and 7 here
        List<Employee> employees = Arrays.asList(
                new FullTimeEmployee("Harry", 4575.09),
                new FullTimeEmployee("Lucius", 3543.91),
                new ContractEmployee("Ron", 45.65, 160),
                new ContractEmployee("Hermione", 30.36, 150)
        );

        for (Employee employee : employees) {
            System.out.println(employee.getDetails());
        }

        System.out.println("Highest Paid Employee: " + getHighestPaid(employees).getDetails());
    }

    static Employee getHighestPaid(List<Employee> employees) {
        Employee employeeWithHighestPay = null;
        for (Employee employee : employees) {
            if (employeeWithHighestPay == null || employee.calculatePay() > employeeWithHighestPay.calculatePay()) {
                employeeWithHighestPay = employee;
            }
        }
        return employeeWithHighestPay;
    }
}
