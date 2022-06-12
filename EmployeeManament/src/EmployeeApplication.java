public class EmployeeApplication {
    public static void main(String[] args){
        Employee employee1;
        Employee employee2;
        Manager employee3;


        employee1 =new Employee("Gilian","Hickey",1, 2);
        employee2 =new Employee("Brian","Hickey",2,23);
        employee3 =new Manager("boss","man",21,34,[100]);

      //  employee1.introduction();
        //employee2.introduction();
       //employee3.introduction();

        Employee[] employees = {employee1,employee2,employee3};

        for (int i =0; i< employees.length;i++){
            employees[i].introduction();
        }

        //for(int i=0; i<70; i++){
          //  employee1.incAge();
            //System.out.println(employee1.getAge());
        }

    }

