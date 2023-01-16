package JavaTopic5;

import java.util.Arrays;

public class ReadSentence5_2 {
    //Exercise 5.2. Write a program that read a sentence(at least 4 words),
    // split the string by spaces and store each piece of strings in an Array.
    // Later print the third element, change the second element to 0, print all the elements and sort it.

    public static void main(String[] args) {

        String phrase = "Hello this is the Portugal team. We are great!";
        String[] newPhrase = phrase.split("\\s+");
        System.out.println("Printing the third element of the array");
        System.out.println(newPhrase[2]);

        //newPhrase[1] = "0";

        System.out.println("-------------------------------------------------");
        System.out.println("Changing the second element position to position 0");

        String aux1 = newPhrase[0];;
        newPhrase[0] = newPhrase[1];
        newPhrase[1] = aux1;


        for (int i = 0; i < newPhrase.length; i++) {
            System.out.println(newPhrase[i]);
        }

        System.out.println("-------------------------------------------------");

        Arrays.sort(newPhrase);
        System.out.println("Sorting the array alphabetically");
        for (int i = 0; i < newPhrase.length; i++) {
            System.out.println(newPhrase[i]);
        }


    }



}
