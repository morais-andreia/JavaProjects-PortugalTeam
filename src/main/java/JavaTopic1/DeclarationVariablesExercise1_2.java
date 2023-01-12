package JavaTopic1;

import java.util.Scanner;

public class DeclarationVariablesExercise1_2 {
    public static void main(String[] args) {

            //Exercise 1.2 Try to declare the following variables: int, double,
            //boolean and string. Give a value. Print the value of the variables.

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name:");
            String myName = scanner.next();

            System.out.println("Enter the price of the PC:");
            double price = scanner.nextDouble();


            if ( price <= 10.99) {
                System.out.println("My Name is " + myName + "  and I Pay " + price +
                        " for this PC, it's, was cheap ");


            }else{
                System.out.println("My Name is " + myName + "  and I Pay " + price +
                        " for this PC, it's, was expensive " );

            }

            //boolean variable
            System.out.println("*******************************************************************************");
            System.out.println("You bought a new PC and you must a celebrate." +
                    "How old are you?");

            System.out.println("Enter you age");
            int age = scanner.nextInt();

            scanner.close();

            boolean legalAge = true;

            if(age < 21){
                legalAge = false;
            }

            if (legalAge == true) {
                System.out.println("Congratulations " + myName + ", you can drink to celebrate your new PC!");
            } else {
               System.out.println( myName + "You can't drink alcohol, don't worry, " +
                       "you can make a toast with a glass of milk!");
            }

       }






    }


