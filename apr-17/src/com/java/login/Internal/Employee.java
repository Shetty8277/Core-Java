package com.java.login.Internal;

import java.util.Objects;

public class Employee {
    private String name;
    private String department;
    private String role;
    private String employeeId;

    public Employee(String name, String department, String role, String employeeId) {
        this.name = name;
        this.department = department;
        this.role = role;
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee(Name: " + name + ", Department: " + department + ", Role: " + role + ", Employee ID: " + employeeId + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Employee) {
            Employee e = (Employee) obj;
            if (Objects.equals(this.name, e.name) && Objects.equals(this.employeeId, e.employeeId)) {
                System.out.println("Employee name and ID match");
                return true;
            }
        }
        return false;
    }
}
