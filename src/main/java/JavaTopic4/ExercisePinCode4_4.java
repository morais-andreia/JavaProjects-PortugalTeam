package JavaTopic4;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ExercisePinCode4_4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        String pinCodeTyped;
        int pinCode = 0;
        int tentativas = 0;
        boolean validSize = false;
        boolean validNumber = false;

        while(tentativas < 3) {
            System.out.println("Type a password: ");
            pinCodeTyped = scanner.next();

            validSize = validateSize(pinCodeTyped);

            if(validSize == false) {
                System.out.println("Invalid size of the pin. Has to be 4 characters!");
                tentativas = 0;
                continue;
            }

            validNumber = validateNumbers(pinCodeTyped);

            if(validNumber == false) {
                System.out.println("Invalid type of the pin. Has to be just numbers!");
                tentativas = 0;
                continue;
            }

            pinCode = parseInt(pinCodeTyped);

            tentativas = validateAcess(pinCode, correctPin, tentativas);
        }

        if (tentativas == 3) {
            System.out.println("System blocked! To much atenptives wrong!");
        }

        scanner.close();
    }


    public static boolean validateSize(String pass) {
        int size = pass.length();
        if(size != 4) {
            return false;
        }
        return true;
    }


    public static boolean validateNumbers(String pass) {
        for (int i = 0; i < pass.length(); i++) {
            if(Character.isDigit(pass.charAt(i)) == false){
                return false;
            }
        }
        return true;
    }


    public static int validateAcess(int pass, int correctPass, int tryed){
        if (pass == correctPass){
            System.out.println("Welcome to the system!");
            tryed = 4;
        } else {
            tryed = tryed + 1;
        }

        return tryed;
    }
}
