// Appointment.java (Composition)
public class Appointment implements Reservable {
    private Patient patient;
    private Doctor doctor;
    private LocalDateTime dateTime;
    private boolean isReserved;

    public Appointment(Patient patient, Doctor doctor, LocalDateTime dateTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
        this.isReserved = false;
    }

    @Override
    public void reserve() {
        if (!isReserved) {
            isReserved = true;
            System.out.println("Appointment reserved for " + patient.name + " with Dr. " + doctor.name);
        } else {
            System.out.println("Appointment is already reserved.");
        }
    }

    @Override
    public void cancelReservation() {
        if (isReserved) {
            isReserved = false;
            System.out.println("Appointment reservation cancelled for " + patient.name + " with Dr. " + doctor.name);
        } else {
            System.out.println("Appointment is not reserved.");
        }
    }

    @Override
    public boolean isReserved() {
        return isReserved;
    }

    // Getters and other methods related to appointments
}
