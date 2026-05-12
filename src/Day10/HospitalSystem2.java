package Day10;
import java.util.*;

class Patient {
    int id;
    String name;

    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name;
    }
}

public class HospitalSystem2 {
    public static void main(String[] args) {

        HashMap<Integer, Patient> map = new HashMap<>();

        // 🔹 Add Patients
        addPatient(map, new Patient(101, "Aryan"));
        addPatient(map, new Patient(102, "Gautam"));
        addPatient(map, new Patient(103, "Prince"));

        // 🔹 Duplicate Check
        addPatient(map, new Patient(101, "Rohit")); // duplicate

        // 🔹 Update Patient
        map.put(102, new Patient(102, "Updated Gautam"));

        // 🔹 Get Patient
        System.out.println("\nPatient 102: " + map.get(102));

        // 🔹 Remove Patient
        map.remove(101);

        // 🔹 List All Patients
        System.out.println("\nAll Patients:");
        for (Patient p : map.values()) {
            System.out.println(p);
        }

        // 🔹 Count Patients
        System.out.println("\nTotal Patients: " + map.size());

        // 🔹 Clear System
        map.clear();
        System.out.println("System cleared");
    }

    // 🔹 Method for adding patient with duplicate check
    public static void addPatient(HashMap<Integer, Patient> map, Patient p) {
        if (map.containsKey(p.id)) {
            System.out.println("❌ Already exists (ID: " + p.id + ")");
        } else {
            map.put(p.id, p);
            System.out.println("✅ Patient added: " + p.id);
        }
    }
}