package com.java.login.Runner;

import com.java.login.Internal.Course;

public class CourseRunner {
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", "CS101", "Mr. John", "4 months");
        Course c2 = new Course("Java Programming", "CS101", "Mr. John", "4 months");
        Course c3 = new Course("Data Structures", "CS102", "Mr. Smith", "3 months");

        boolean match = c1.equals(c2);
        boolean noMatch = c2.equals(c3);

        System.out.println("Course match: " + match);
        System.out.println("Course not match: " + noMatch);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
