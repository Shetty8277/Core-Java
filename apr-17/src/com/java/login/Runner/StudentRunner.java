package com.java.login.Runner;

import com.java.login.Internal.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", "A", "S123", "Computer Science");
        Student s2 = new Student("Alice", "A", "S123", "Computer Science");
        Student s3 = new Student("Bob", "B", "S124", "Mechanical Engineering");

        boolean match = s1.equals(s2);
        boolean noMatch = s2.equals(s3);

        System.out.println("Student match: " + match);
        System.out.println("Student not match: " + noMatch);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}
