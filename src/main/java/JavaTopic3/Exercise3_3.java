package JavaTopic3;

import java.util.Scanner;

public class Exercise3_3 {
     //Exercise 3.3. Create a program that read a type of animal.
    // The program should print “this is not the correct animal”
    // until the user write the correct one (“koala”).

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String animal = "koala";
        String nameAnimal;

        do{
            System.out.println("Enter the name of the secret animal");
            nameAnimal = scanner.next();
            if ((nameAnimal.equalsIgnoreCase(animal))){
                System.out.println("You won, congrads, the name of the animal is " + animal);
                break;
            }

        } while(nameAnimal != animal);
        scanner.close();






    }
}
