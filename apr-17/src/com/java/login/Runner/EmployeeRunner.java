package com.java.login.Runner;

import com.java.login.Internal.Employee;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee e1 = new Employee("John Doe", "IT", "Developer", "E123");
        Employee e2 = new Employee("John Doe", "IT", "Developer", "E123");
        Employee e3 = new Employee("Jane Smith", "HR", "Manager", "E124");

        boolean match = e1.equals(e2);
        boolean noMatch = e2.equals(e3);

        System.out.println("Employee match: " + match);
        System.out.println("Employee not match: " + noMatch);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
    }
}
