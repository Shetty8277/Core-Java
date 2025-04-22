package com.java.exam.runner;

import com.java.exam.external.Student;
import com.java.exam.internal.rule.College;

public class StudentRunner {
    public static void main(String[] args) {
        College college = new Student();
        college.test();
    }
}
