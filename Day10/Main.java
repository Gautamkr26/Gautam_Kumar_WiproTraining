package Day10;

import java.util.*;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class Main {
    public static void main(String[] args) {

        TreeSet<Patient> patients = new TreeSet<>(Comparator.comparingInt(p -> p.id));

        addPatient(patients, new Patient(101, "Rahul"));
        addPatient(patients, new Patient(102, "Aman"));
        addPatient(patients, new Patient(101, "Rohit")); 
        addPatient(patients, new Patient(103, "Priya"));

        System.out.println("\nUnique Registered Patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    public static void addPatient(TreeSet<Patient> patients, Patient p) {
        if (patients.add(p)) {
            System.out.println("Patient added: " + p.id);
        } else {
            System.out.println("Already registered (ID exists): " + p.id);
        }
    }
}