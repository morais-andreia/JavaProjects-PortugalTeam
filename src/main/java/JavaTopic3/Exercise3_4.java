package JavaTopic3;
import java.util.Scanner;
public class Exercise3_4 {
           //Exercise 3.4.  Create a program that read the age and print:

            //If you are not older than 18, print “You are too young” (Use the symbol “!”)
            //If your age is 18 or more and less or equals to 35, print “Young man”
            //If you are more or equal to 36,  or your age is less or equals than 60, print “you are middle age person”
            //For other situations print: “you are too old”

    public static void main(String args[]){

        System.out.println("Enter your age and i'll roast you for free!");
        Scanner scanner = new Scanner(System.in);
        double age = scanner.nextDouble();
        scanner.close();

        if(age <= 0){
            System.out.println("╭━━╮     ╭╮\n" +
                    "┃╭╮┃     ┃┃\n" +
                    "┃╰╯╰┳━┳╮╭┫╰━╮\n" +
                    "┃╭━╮┃╭┫┃┃┃╭╮┃\n" +
                    "┃╰━╯┃┃┃╰╯┃┃┃┣┳┳╮\n" +
                    "╰━━━┻╯╰━━┻╯╰┻┻┻╯");
        }
        else if(age < 18){
            System.out.println("Baby face!");
        }

        else if(age >=18 && age <=35){
            System.out.println("Looking fresh!");
        }
        else if(age >= 36 && age <=60){
            System.out.println("Well not everything remains new...");
        }
        else if(age >= 61 && age <=89){
            System.out.println("Not gonna lie... you've seen better days.");
        }
        else{
            System.out.println("DAIM!!! You belong in a museum!");
        }

        }




}
