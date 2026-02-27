package org.example.patients;

public class ConsultationPatient extends Patient {

    public ConsultationPatient(String name, int age, String id, String illness) {
        super(name, age, id, illness);
    }

    @Override
    public void admission() { System.out.println(getName() + " admitted to consultation."); }

    public void nurseCheck() { System.out.println("Nurse checks patient " + getName() + "."); }

    @Override
    public void room() { System.out.println(getName() + " assigned to consultation room."); }

    @Override
    public void treatment() { System.out.println(getName() + " is receiving treatment."); }

    public void nextAppointment() { System.out.println("Next appointment scheduled for " + getName() + "."); }

    @Override
    public void discharge() { System.out.println(getName() + " has been discharged."); }

    @Override
    public void showInfo() {
        System.out.println("Consultation Patient: " + getName() + " | Age: " + getAge() + " | ID: " + getId() + " | Illness: " + getIllness());
    }
}