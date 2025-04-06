// create a Employee class with name and salary then add 5 employees in a list
//   then write a static method which will take a list and print totalsalary for them


package com.example;
import java.util.ArrayList;
import java.util.List;

// Class representing an Employee with name and salary attributes
public class EmpDetails {
    private String name;
    private double salary;

    // Constructor to initialize Employee details
    public EmpDetails(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // Getter method to retrieve salary of an employee
    public double getSalary() {
        return salary;
    }

    // Static method to print each employee's salary and calculate total salary
    public static void printTotalSalary(List<EmpDetails> employees) {
        double totalSalary = 0;

        // Loop through the list of employees and display their salaries
        for (EmpDetails emp : employees) {
            totalSalary += emp.getSalary();
            System.out.println(emp.name + " has a salary of " + emp.salary);
        }

        // Print the total salary of all employees combined
        System.out.println("Total salary: " + totalSalary);
    }

    // Main method to create employees, add them to a list, and invoke the salary calculation method
    public static void main(String[] args) {
        List<EmpDetails> employees = new ArrayList<>();

        // Adding employee objects to the list
        employees.add(new EmpDetails("Sayantani", 10000));
        employees.add(new EmpDetails("Souparno", 30000));
        employees.add(new EmpDetails("Tamojit", 28000));
        employees.add(new EmpDetails("Aditya", 36000));
        employees.add(new EmpDetails("Trisha", 25000));

        // Calling the method to print individual salaries and total salary
        printTotalSalary(employees);
    }
}