package JavaTopic5;
import java.util.Random;

public class RandomTickets5_1 {
    //Exercise 5.1.  Try to do the exercise of Java Course:
    // Chapter 7a, but instead to generate tickets,
    // try to generate random strings of 5 length. When you will print the strings, change it to UpperCase.
    public static String randomLine() {

        String alphabet = "ABCDEFGHIJKLMNOPKRSTUVWXYZ", line = "";
        Random random = new Random();
        int randomNum = 0;

        // gerar 5 letras aleatorias e adiciona-las na linha.

        for (int i = 0; i < 5; i++) {

            randomNum = (random.nextInt(26));
            line = line + String.valueOf(alphabet.charAt(randomNum));
        }
        return line;
    }
    // repetir metodo (randomLine) cinco vezes.
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {

            System.out.println(randomLine());
        }
    }


}
