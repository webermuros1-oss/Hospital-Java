package org.example.doctors;

public class StudentDoctor extends Doctor {

    private int studyHours;
    private String currentCourse;

    public StudentDoctor(String name, int age, String id, int weeklyHours, int studyHours, String currentCourse) {
        super(name, age, id, weeklyHours);
        this.studyHours = studyHours;
        this.currentCourse = currentCourse;
    }

    @Override
    public void workHours() {
        System.out.println("Student Doctor " + getName() + " works " + getWeeklyHours() + " hours per week.");
    }

    public void studyHours() {
        System.out.println("Student Doctor " + getName() + " studies " + studyHours + " hours per week.");
    }

    @Override
    public void eat() {
        System.out.println("Student Doctor " + getName() + " is eating.");
    }

    @Override
    public void vacation() {
        System.out.println("Student Doctor " + getName() + " is on vacation.");
    }

    public int getStudyHours() { return studyHours; }
    public void setStudyHours(int studyHours) { this.studyHours = studyHours; }

    public String getCurrentCourse() { return currentCourse; }
    public void setCurrentCourse(String currentCourse) { this.currentCourse = currentCourse; }

    @Override
    public void showInfo() {
        System.out.println("Student Doctor: " + getName() + " | Age: " + getAge() + " | ID: " + getId() + " | Course: " + currentCourse + " | Weekly Hours: " + getWeeklyHours() + " | Study Hours: " + studyHours);
    }
}