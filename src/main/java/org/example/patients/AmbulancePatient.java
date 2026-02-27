package org.example.patients;

public class AmbulancePatient extends Patient {

    public AmbulancePatient(String name, int age, String id, String illness) {
        super(name, age, id, illness);
    }

    @Override
    public void admission() { System.out.println(getName() + " admitted via ambulance."); }

    public void operation() { System.out.println("Emergency operation performed on " + getName() + "."); }

    @Override
    public void room() { System.out.println(getName() + " assigned to emergency room."); }

    @Override
    public void treatment() { System.out.println(getName() + " is receiving intensive treatment."); }

    public void rehabilitation() { System.out.println(getName() + " is in rehabilitation."); }

    @Override
    public void discharge() { System.out.println(getName() + " has been discharged."); }

    @Override
    public void showInfo() {
        System.out.println("Ambulance Patient: " + getName() + " | Age: " + getAge() + " | ID: " + getId() + " | Illness: " + getIllness());
    }
}