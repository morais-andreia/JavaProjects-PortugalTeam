package JavaTopic3;
import java.util.Scanner;
public class WordReader3_3 {

    public static void main(String args[]) {


        String Correct_Ansewr;
        Scanner User_answer;

        System.out.println("What is this animal's name?");

        while (true){
            User_answer = new Scanner(System.in);
            Correct_Ansewr = User_answer.nextLine();

            if (Correct_Ansewr.equals("Koala")) {
                System.out.println("You guessed!");
                break;
                }
              else
            System.out.println("You lose! Try again!");
        }

        }
    }




