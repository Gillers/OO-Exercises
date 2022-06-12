import java.util.Scanner;

public class task1 {
    public static String greeting(String name){

        return "Hello " + name;
    }

    public static String OddEven(int a){
        if
        (a % 2 == 0)
        return "Even";

        else if (a % 2 != 0)
            return "Odd";
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        System.out.println("please enter a number");

        System.out.println(OddEven(num));


        System.out.println(greeting("Gillian"));

    }
}
