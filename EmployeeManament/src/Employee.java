    public class Employee {
    private String firstname;
    private String lastname;
    private int dept;
    private int employeenum;
    private int age;



    public Employee(String empfname, String emplname, int dep, int id) {
        firstname = empfname;
        lastname = emplname;
        dept = dep;
        employeenum = id;
    }

        public void addEmployee(Employee[]) {


        }


        public String getName() {
        String fullname;
        fullname = firstname +" " + lastname;
        return fullname;
    }

    public void introduction(){
        System.out.println("Name is " +firstname +" " +lastname);
        System.out.println("Dept is " +dept);
        System.out.println("Employee number is " +employeenum);

    }

    public void incAge(){

        if (age<65)
        age++;
    }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
}
