package com.company;

public class Student extends Person {
    // Fields
    private double GPA;
    private int grade;
    private String major;

    // Constructor
    public Student(String firstName, String familyName, double GPA, int grade, String major) {
        super(firstName, familyName);
        this.GPA = GPA;
        this.grade = grade;
        this.major = major;
    }

    // Methods

    // Getters
    public double getGPA() {
        return GPA;
    }
    public int getGrade() {
        return grade;
    }
    public String getMajor() {
        return major;
    }

    // Setters
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the student's "FamilyName, FirstName, GPA, Grade, Major".
     */

    public String toString() {
        return getFamilyName() + ", " + getFirstName() +
                " | GPA: " + getGPA() +
                " | Grade: " + getGrade() +
                " | Major: " + getMajor();
    }
}