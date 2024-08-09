// MedicalRecord.java (Composition)
public class MedicalRecord {
    private List<String> medicalHistory;
    private List<String> medicalReports;

    public MedicalRecord() {
        this.medicalHistory = new ArrayList<>();
        this.medicalReports = new ArrayList<>();
    }

    public void addToMedicalHistory(String entry) {
        medicalHistory.add(entry);
    }

    public void addMedicalReport(String report) {
        medicalReports.add(report);
    }

    // Getters and other methods for managing medical records
}

