import hospital.Patient;
import hospital.Doctor;
import hospital.Receptionist;
public class Main {
    public static void main(String[] args) {
        Patient Patient=new Patient("Remembers", "Therapies",
                "tuesday", "kampala", 60);

        System.out.println("The Patient is " + Patient.Name);
        System.out.println("The appointment day is " + Patient.Appointmentday);
        Patient.Medicaldetails();

        Doctor Doctor= new Doctor("Barons","Room five","Surgeon and Therapist");
        Doctor.atendpatient();

        Receptionist receptionist= new Receptionist("Flora", 1011, 123, 456);
        receptionist.Receptionistplan();
    }
}
