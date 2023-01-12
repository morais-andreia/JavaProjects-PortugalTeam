package JavaTopic3;
import java.util.Scanner;
public class TesteDoWhile {
    public static void main(String args[]){


        Scanner scanner = new Scanner(System.in);
        String Exit =null;

        do {
            System.out.println("Guess the name of the animal");
            Exit= scanner.next(); // or input.nextLine();
        } while(!Exit.equals("y"));



    }
}
