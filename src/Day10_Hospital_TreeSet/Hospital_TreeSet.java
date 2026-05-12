package Day10_Hospital_TreeSet;
import java.util.*;

class Patient implements Comparable<Patient> {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Patient p) {
        return Integer.compare(this.id, p.id);
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class Hospital_TreeSet {
    public static void main(String[] args) {

        TreeSet<Patient> patients = new TreeSet<>();

        addPatient(patients, new Patient(101, "Aryan"));
        addPatient(patients, new Patient(102, "Gautam"));
        addPatient(patients, new Patient(103, "Prince"));
        addPatient(patients, new Patient(101, "Rohit")); // duplicate

        System.out.println("\nAll Patients:");
        for (Patient p : patients) {
            System.out.println(p);
        }
    }

    static void addPatient(TreeSet<Patient> patients, Patient p) {
        if (patients.add(p)) {
            System.out.println("Patient added: " + p.id);
        } else {
            System.out.println("Already exists (ID: " + p.id + ")");
        }
    }
}