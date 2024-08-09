// Hospital.java (Singleton)
public class Hospital {
    private static Hospital instance;
    private List<Patient> patients;
    private List<Doctor> doctors;

    private Hospital() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
    }

    public static Hospital getInstance() {
        if (instance == null) {
            instance = new Hospital();
        }
        return instance;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void displayPatients() {
        for (Patient patient : patients) {
            patient.displayInfo();
        }
    }

    public void displayDoctors() {
        for (Doctor doctor : doctors) {
            doctor.displayInfo();
        }
    }

    // Methods for handling patient admission, discharge, and appointment booking
}
