// Doctor.java (Subclass of Person)
public class Doctor extends Person {
    private String specialization;
    private List<Appointment> appointments;

    public Doctor(String name, int age, String id, String specialization) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.specialization = specialization;
        this.appointments = new ArrayList<>();
    }

    @Override
    public void displayInfo() {
        System.out.println("Doctor: " + name + ", Age: " + age + ", ID: " + id + ", Specialization: " + specialization);
    }

    // Getters, setters, and methods for managing appointments
}
