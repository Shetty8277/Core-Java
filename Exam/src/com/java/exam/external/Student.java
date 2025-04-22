package com.java.exam.external;

import com.java.exam.internal.rule.College;

public class Student implements College {

    @Override
    public void test() {
        System.out.println("Running in college in Student");
    }
}
