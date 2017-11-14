package org.launchcode.java.school;

import java.util.List;

public class Course {

    private List<Student> students;
    private int courseId;
    private String name;

    public Course() {
    }

    public List<Student> getStudents() {
        return students;
    }

    public Course setStudents(List<Student> students) {
        this.students = students;
        return this;
    }

    public int getCourseId() {
        return courseId;
    }

    public Course setCourseId(int courseId) {
        this.courseId = courseId;
        return this;
    }

    public String getName() {
        return name;
    }

    public Course setName(String name) {
        this.name = name;
        return this;
    }
}
