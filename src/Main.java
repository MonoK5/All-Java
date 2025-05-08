//import java.util.Scanner;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//
////        System.out.println("what is your name? \n How old are you? \n How much do you earn?");
//        System.out.print("Calculate");
//
//        int time = input.nextInt();
//        int price = input.nextInt();
//        int tip = input.nextInt();
//        int total = price * time + tip ;
//
//
//        System.out.println(time * price + tip);
//    }
//}

//
//        String name = input.nextLine();
//        int age = input.nextInt();
//        char rand = 'R';


//        System.out.println("your name is " + name + " you are " + age + " you earn " + rand );

//     int result = 0;
//      if (op.equals("+")) {
//          result = first + second;
//           System.out.println("The answer is: " + result);
//
//      }else if (op.equals("-")) {
//        result = first - second;
//          System.out.println("The answer is: " + result);
//     }else if (op.equals("*")) {
//          result = first * second;
//          System.out.println("The answer is: " + result);
//     }else if (op.equals("/")) {
//          result = first / second;
//          System.out.println("The answer is: " + result);
//     }else {
//         System.out.println("Invalid operation");
//     }
////
////
////        }
////
////    }
////
////
////

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("search for the name");


        String[] names = {"Gugu", "Lindelani", "Mbali", "Bob"};
        String target = scanner.nextLine();
        boolean found = false;
        int index = scanner.nextInt();

        System.out.println("Enter your name");
        for (String name : names) {
            if (name.contains(target)) {
                System.out.println("You searched for " + name);

                found = true;
                break;

            }


        }
        if (!found) {
            System.out.println("That name does not exist");
        }
    }
}
