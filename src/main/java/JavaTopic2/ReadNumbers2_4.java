package JavaTopic2;
import java.util.Scanner;
public class ReadNumbers2_4 {

    public static void main(String args[]){

         //Exercise 2.4. Write a program that reads three numbers,
        // and print which is the biggest. Does it work?
        // Now imagine, that the developer has create this code base on the requirements,
        // can you find any situation in which it works wrong? Now try to fix your code.


            //picking a number//

            Scanner scanner = new Scanner(System.in);
            System.out.println("Insert a number");
            int num1 = scanner.nextInt();

            System.out.println("Insert another number");
            int num2 = scanner.nextInt();

            System.out.println("Insert last number");
            int num3 = scanner.nextInt();

            scanner.close();

            //making the calculation//

            if (num1 > num2 && num1 > num3) {
                System.out.println("Your biggest number is: " + num1);
            }
            else if (num2 > num3 && num2 > num1) {
                System.out.println("Your biggest number is: " + num2);
            }
            else{ System.out.println("Your biggest number is: " + num3);
            }
        }

}

