
import java.util.Scanner;
import java.io.*;
public class Home_practice1 {
    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter UserName");
//        String username = sc.nextLine();
//
//        System.out.println("enter Password");
//        String password = sc.nextLine();
//
//        if (username.equals("admin") && password.equals("12345"))
//        {
//        System.out.println("welcome");
//        }
//        else
//        {
//          System.out.println("invalid");
//        }
//
//
//    }
//}

//Question 2
//
//        int num1, num2, result;
//        Scanner pc = new Scanner(System.in);
//        char op;
//        System.out.println("Enter number1");
//        num1 = pc.nextInt();
//
//        System.out.println("Enter number2");
//        num2 = pc.nextInt();
//
//        System.out.println("Enter operator");
//        op = pc.next().charAt(0);
//
//
//        if (op == '+') {
//            System.out.println(num1 + num2);
//        } else if (op == '-') {
//            System.out.println(num1 - num2);
//        } else if (op == '*') {
//            System.out.println(num1 * num2);
//        } else if (op == '/')
//        {
//            System.out.println(num1 / num2);
//        }
//
////        else
////        {
////            System.out.println("please enter valid number");
//       // }
//    }
//}
//


//        Question 3
//        int i = 20;
//
//        if ( i ==15)
//        {
//            System.out.println("i is 10\n");
//        }
//else if ( i == 16)
//        {
//            System.out.println("i s 16\n");
//        }
//
//else if ( i == 20)
//        {
//            System.out.println("i is 20\n");
//        }
//
//else {
//    System.out.println("i is not present");
//        }
//    }
//}


////Question 4
//
//        int i = 19;
//
//        if (i < 10) {
//            System.out.println("i is less than 10");
//        } else if (i > 25) {
//            System.out.println("i is greater than 20");
//        } else if (i == 20) {
//            System.out.println("i is greater than 20 ");
//        } else {
//            System.out.println("i is greater than " + "or equal to 19");
//        }
//    }
//}


//Question 5

        Scanner gc = new Scanner(System.in);
        System.out.println("Enter any number");
        int number = gc.nextInt();

        if (number > 0) {
            System.out.println("this number is positive");
        } else if (number < 0) {
            System.out.println("this is is negative");
        } else {
            System.out.println("this number is zero");
        }

    }
}