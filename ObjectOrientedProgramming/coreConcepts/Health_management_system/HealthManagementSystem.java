// HealthManagementSystem.java (Main Class)
public class HealthManagementSystem {
    public static void main(String[] args) {
        // Create hospital instance
        Hospital hospital = Hospital.getInstance();

        // Create patients and doctors
        Patient patient1 = new Patient("John Doe", 35, "P001");
        Patient patient2 = new Patient("Jane Smith", 42, "P002");
        Doctor doctor1 = new Doctor("Dr. Alice Johnson", 45, "D001", "Cardiology");
        Doctor doctor2 = new Doctor("Dr. Bob Williams", 52, "D002", "Pediatrics");

        // Add patients and doctors to the hospital
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Display patients and doctors
        hospital.displayPatients();
        hospital.displayDoctors();

        // Create an appointment and reserve it
        Appointment appointment = new Appointment(patient1, doctor1, LocalDateTime.now().plusDays(3));
        appointment.reserve();

        // Cancel the appointment reservation
        appointment.cancelReservation();
    }
}
