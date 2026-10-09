package hospital;
public class Doctor {
    public String Name;
    public String Office;
    public  String Professionalism;
    public Doctor(String N,String O,String P){
        Name=N;
        Office =O;
        Professionalism=P;
    }
    public  void  patient(){
        System.out.println("Doctor attending the patient ");
    }
}
