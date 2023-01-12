package JavaTopic3;
import java.util.Scanner;
public class Exercise3_6 {

    public static void main(String args[]) {
        //Exercise 3.6. System must request fill numbers until the user write the number zero.
        // After that system will print the sum of all the numbers.

        Scanner scanner = new Scanner(System.in);
        //int isertedNumber[];
        int numbX;
        int sum = 0;


        do{
            System.out.println("Type of numbers or zero to exit");
            numbX = scanner.nextInt();
            sum = sum + numbX;


        } while(numbX != 0);
        scanner.close();
        System.out.println("The sum of the numbers is : " + sum);


    }

}
