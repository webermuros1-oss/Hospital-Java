package org.example.doctors;

public class Specialist extends Doctor {

    private String specialty;

    public Specialist(String name, int age, String id, int weeklyHours, String specialty) {
        super(name, age, id, weeklyHours);
        this.specialty = specialty;
    }

    @Override
    public void workHours() { System.out.println("Works " + getWeeklyHours() + " hours per week."); }

    @Override
    public void eat() { System.out.println("Specialist " + getName() + " is eating."); }

    @Override
    public void vacation() { System.out.println("Specialist " + getName() + " is on vacation."); }

    public String getSpecialty() { return specialty; }
    public void setSpecialty(String specialty) { this.specialty = specialty; }

    @Override
    public void showInfo() {
        System.out.println("Specialist: " + getName() + " | Age: " + getAge() + " | ID: " + getId() + " | Specialty: " + specialty + " | Weekly Hours: " + getWeeklyHours());
    }
}