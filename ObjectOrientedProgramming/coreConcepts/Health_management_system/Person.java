// Person.java (Abstract Class)
public abstract class Person {
    protected String name;
    protected int age;
    protected String id;

    public abstract void displayInfo();
}

// Patient.java (Subclass of Person)
public class Patient extends Person {
    private MedicalRecord medicalRecord;
    private List<Appointment> appointments;

    public Patient(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.medicalRecord = new MedicalRecord();
        this.appointments = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Patient: " + name + ", Age: " + age + ", ID: " + id);
    }

    // Getters, setters, and methods for managing medical record and appointments
}
