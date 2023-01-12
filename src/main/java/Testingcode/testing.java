package Testingcode;

import java.util.Scanner;

public class testing {

    public static void main(String args[]) {
  /*Exercise 4.4. You have to design the code of the access of an account.
  The user can try the access 3 times, if the pin is not correct 3 times, the account will be blocked.

The pin must be a number of 4 digits.

The actions of the system should be:
-       Verify if it’s only a numbers (no letters)
-       Verify if its only 4 digits (not 3 or 1, it must be 4)
-       If the pin code doesn’t fit, user must fill again and again
(infinite times) until the pin code accomplish the rules.
-       If the pin code is correct, system allows access to the account.
-       If the pin code is incorrect, user has other 2 tries. If after the
3 attempts user don’t fill the correct pin code, the account will be blocked.

Note: take it easy. Try to develop the code following these steps:
Step 1: First try to create the code to fill the pin code.  Use "String pincode = scanner.next();”.
Step 2:Then try to include the limit of 3 tries.
Step 3: When it works try to include the rule of the 4 elements
Step 4: At the end include the rule that it couldn’t be different of a number.*/

        int correctPin = 1234, pin, count = 3;


        System.out.println("Your pin is: 1234");
        Scanner input = new Scanner(System.in);


        while (count > 0) {
            count--;
            System.out.println("Please insert your pin.");
            pin = input.nextInt();

            if (correctPin == pin) {
                System.out.println("Welcome! You're successfully logged in.");
                break;
            } else {
                System.out.println("Incorrect pin you have " + count + " trie(s) left!");
            }
        }
        if (count == 0) {
            System.out.println("You are locked out!");
        }
        input.close();
 }
}


