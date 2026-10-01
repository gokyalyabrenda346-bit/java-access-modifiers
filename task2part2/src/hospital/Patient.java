package hospital;
public class Patient {
    public String Name;
    private  String Medicaldetails;
    public String  Appointmentday;
    public String residence;
    public int Age;
    public Patient(String N, String M, String d,String r, int a){
        Name=N;
        Medicaldetails=M;
        Appointmentday=d;
        residence=r;
        Age=a;
    }
    public void Medicaldetails(){
        System.out.println("The Medical details is " + Medicaldetails);     
    }
}
