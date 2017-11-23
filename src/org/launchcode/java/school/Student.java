package org.launchcode.java.school;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getStudentId() {
        return studentId;
    }

    public Student setStudentId(int studentId) {
        this.studentId = studentId;
        return this;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public Student setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
        return this;
    }

    public double getGpa() {
        return gpa;
    }

    public Student setGpa(double gpa) {
        this.gpa = gpa;
        return this;
    }
}
