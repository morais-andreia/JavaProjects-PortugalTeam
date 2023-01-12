package JavaTopic2;
import java.util.Scanner;
public class GameChange2_1 {

    public static void main(String args[]){

        /*Create a game were the user has to insert a number of coins to reach one dollar*/

        double penny = 0.01;
        double nickel = 0.05;
        double dime = 0.10;
        double quarter = 0.25;
        double dollar = 1.00;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Please insert number of pennies!");
        double numOfPenny = scanner.nextDouble();


        System.out.println("Please insert number of nickles!");
        double numOfNickel = scanner.nextDouble();


        System.out.println("Please insert number of dimes!");
        double numOfDimes = scanner.nextDouble();


        System.out.println("Please insert number of quarters!");
        double numOfQuarters = scanner.nextDouble();
        scanner.close();

        double total = numOfPenny * penny + numOfNickel * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if (total < dollar) {
            double total1 = dollar - total;
            System.out.println("Sorry you didn't get a dollar. Your value is short of:" + total1);

        }
        else if (total > dollar) {
            double total2 = total - dollar;
            System.out.println("Sorry you didn't get a dollar. Your value is over by:" + total2);

        }
        else if (total == dollar){
            System.out.println("Congratulations you win nothing!");
        }




    }
}
