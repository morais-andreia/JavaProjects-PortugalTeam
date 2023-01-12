package JavaTopic2;
import java.util.Scanner;

public class SameStructure2_3 {

    public static void main(String args[]){

        /*Exercise 2.2 . Write a program that prints on the screen the price
        of a cinema ticket according to the age of the customer. The program
        must read the user’s age and calculate the price as follows: (a) Normal
        ticket: 7 euros; (b) Children under 5: 60% discount; (c) People over 60:
        55% discount.*/





        double precoDoBilhete = 7;
        double desconto = 0;
        double desconto2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcom to Bruno's Cinema Theatre. What´s your age?");
        int idadeDaPessoa = scanner.nextInt();


        desconto = precoDoBilhete * 0.6;
        desconto2 = precoDoBilhete * 0.55;

        if(idadeDaPessoa <= 5){
            double descontoPreco = desconto - precoDoBilhete;
            System.out.println("The ticket has received a 60% discount!" + "The ticket price is now " + String.format("%.2f", desconto));
            double descontoPreco2 = scanner.nextDouble();
        }

        if(idadeDaPessoa >= 60){
            double descontoPreco = desconto2 - precoDoBilhete;
            System.out.println("The ticket has received a 55% discount! " + "The ticket price is now " + String.format("%.2f", desconto2));
            double descontoPreco2 = scanner.nextDouble();
        }

        else{
            System.out.println("The ticket´s price is 7 euros.");

        }



    }
}
