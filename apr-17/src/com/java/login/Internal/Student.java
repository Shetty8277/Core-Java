package com.java.login.Internal;

import java.util.Objects;

public class Student {
    private String name;
    private String grade;
    private String rollNumber;
    private String course;

    public Student(String name, String grade, String rollNumber, String course) {
        this.name = name;
        this.grade = grade;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student(Name: " + name + ", Grade: " + grade + ", Roll No: " + rollNumber + ", Course: " + course + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Student) {
            Student s = (Student) obj;
            if (Objects.equals(this.name, s.name) && Objects.equals(this.rollNumber, s.rollNumber)) {
                System.out.println("Student name and roll number match");
                return true;
            }
        }
        return false;
    }
}
