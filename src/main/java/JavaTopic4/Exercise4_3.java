package JavaTopic4;
import java.util.Scanner;
public class Exercise4_3 {
    //Exercise 4.3. Write a program to read an integer value on the keyboard and print an asterisk square of this size.
    // For instance, if the number is 4, the program must print: **** **** **** ****

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int numB = scanner.nextInt();
        int numB2 = numB * numB;
        int aux = numB;

        for ( int i = 0; i < numB2; i++){
            if (i == aux){
                System.out.print(" *");
                aux = aux + numB;
            } else {
                System.out.print("*");
            }


        }


    }
}