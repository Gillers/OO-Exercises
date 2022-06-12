import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        //  int input=0;
        //  Scanner sc = new Scanner (System.in);
        //  System.out.println("Enter a number");
        //  int num = sc.nextInt();


        // while (input < num) {
        //      System.out.println(input);
        //     input++;
        // }
        //     for(input=0; input < num;input++)
        //        if (input %2==0)
        //             System.out.println(input);


        //  }
   //public class task1 {
        //    public static String greeting(String name){
        //        return "Hello " + name;
        //    }
        //
        //
        //    public static void main(String[] args) {
        //        System.out.println(greeting("Gillian"));
        //
        //    }
        //}


        int x =1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        //while (mynum<n) {
          //  System.out.println(mynum);
            //mynum++;
      //  }
            for(x =0;x<n; x++)
            {
                if (x % 3 == 0)
                    System.out.println("Fizz");
                else if (x % 5 == 0)
                    System.out.println("Buzz");
                else if (x % 3 ==0 && x % 5==0)
                    System.out.println("FizzBuzz");
                else
                    System.out.println(x);

            }
        }
}



