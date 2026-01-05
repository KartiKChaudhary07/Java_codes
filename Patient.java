abstract class Patient {
    protected String name;
    abstract double calculateBill();

    public void getPatientDetails() {
        System.out.println(name + " Bill: " + calculateBill());
    }
}

interface MedicalRecord {
    void addRecord(String record);
}

class InPatient extends Patient {
    public double calculateBill() { return 5000; }
}

class OutPatient extends Patient {
    public double calculateBill() { return 500; }
}
class EmergencyPatient extends Patient implements MedicalRecord {
    public double calculateBill() { return 2000; }

    public void addRecord(String record) {
        System.out.println("Emergency record added: " + record);
    }
}