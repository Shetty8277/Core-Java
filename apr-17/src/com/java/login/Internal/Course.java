package com.java.login.Internal;

import java.util.Objects;

public class Course {
    private String courseName;
    private String courseCode;
    private String instructor;
    private String duration;

    public Course(String courseName, String courseCode, String instructor, String duration) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course(Name: " + courseName + ", Code: " + courseCode + ", Instructor: " + instructor + ", Duration: " + duration + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Course) {
            Course c = (Course) obj;
            if (Objects.equals(this.courseCode, c.courseCode)) {
                System.out.println("Course code match");
                return true;
            }
        }
        return false;
    }
}
