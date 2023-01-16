package JavaTopic5;
import java.util.Random;
public class RandomPhrases5_1 {
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
