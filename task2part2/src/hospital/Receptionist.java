package hospital;
public class Receptionist {
    public String Name;
    public int ID;
    protected int code;
    int schedule;

    public Receptionist(String N, int ID, int c, int s) {
        Name = N;
        ID = ID;
        code = c;
        schedule = s;
    }
    public void receptionist(){
        System.out.println("Arranging appointments,schedules creating bills and registering patients");
    }
}