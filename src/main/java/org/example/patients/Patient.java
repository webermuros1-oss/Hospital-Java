package org.example.patients;

import org.example.character.Character;
import org.example.interfaces.Attendable;

public abstract class Patient extends Character implements Attendable {

    private String illness;

    public Patient(String name, int age, String id, String illness) {
        super(name, age, id);
        this.illness = illness;
    }

    public String getIllness() { return illness; }
    public void setIllness(String illness) { this.illness = illness; }

    public abstract void room();
}