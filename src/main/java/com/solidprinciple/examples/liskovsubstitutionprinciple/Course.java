package com.solidprinciple.examples.liskovsubstitutionprinciple;

public abstract class Course {
        private String courseName;
        private int courseCredits;

        public Course(String courseName, int courseCredits) {
            this.courseName = courseName;
            this.courseCredits = courseCredits;
        }

        public String getCourseName() {
            return courseName;
        }

        public int getCourseCredits() {
            return courseCredits;
        }

        public abstract String getDepartment();
    }


