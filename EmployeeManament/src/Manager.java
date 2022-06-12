public class Manager extends Employee {

private Employee[] manages;
private int lastfreepos;

manages [] =new manages[100];

    public Manager(String empfname, String emplname, int dep, int id) {
        super(empfname, emplname, dep, id);
        manages = new Employee[100];
        lastfreepos = 0;
    }
}
