package org.example.doctors;

import org.example.character.Character;
import org.example.interfaces.Worker;

public abstract class Doctor extends Character implements Worker {

    private int weeklyHours;

    public Doctor(String name, int age, String id, int weeklyHours) {
        super(name, age, id);
        this.weeklyHours = weeklyHours;
    }

    public int getWeeklyHours() { return weeklyHours; }
    public void setWeeklyHours(int weeklyHours) { this.weeklyHours = weeklyHours; }
}