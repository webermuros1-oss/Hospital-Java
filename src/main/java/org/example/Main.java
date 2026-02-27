package org.example;

import org.example.doctors.Specialist;
import org.example.doctors.StudentDoctor;
import org.example.patients.AmbulancePatient;
import org.example.patients.ConsultationPatient;

public class Main {
    public static void main(String[] args) {

        // Patients
        ConsultationPatient p1 = new ConsultationPatient("Ana", 25, "P1", "Flu");
        ConsultationPatient p2 = new ConsultationPatient("Luis", 30, "P2", "Headache");

        AmbulancePatient p3 = new AmbulancePatient("Carlos", 40, "P3", "Accident");
        AmbulancePatient p4 = new AmbulancePatient("Maria", 50, "P4", "Heart attack");

        // Doctors
        Specialist d1 = new Specialist("Dr. House", 45, "D1", 40, "Diagnostics");
        Specialist d2 = new Specialist("Dr. Strange", 50, "D2", 35, "Surgery");

        StudentDoctor d3 = new StudentDoctor("John", 28, "D3", 20, 15, "Cardiology");
        StudentDoctor d4 = new StudentDoctor("Laura", 26, "D4", 25, 20, "Neurology");

        // Print patients
        System.out.println("=== PATIENTS ===");
        p1.showInfo();
        p2.showInfo();
        p3.showInfo();
        p4.showInfo();

        // Print doctors
        System.out.println("\n=== DOCTORS ===");
        d1.showInfo();
        d2.showInfo();
        d3.showInfo();
        d4.showInfo();
    }
}

