package JavaTopic2;
import java.util.Scanner;
public class CinemaTicket2_2 {

    public static void main(String args[]){


        double precoDoBilhete = 7;
        double desconto = 0;
        double desconto2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("What´s your age?");
        int idadeDaPessoa = scanner.nextInt();


        desconto = precoDoBilhete * 0.6;
        desconto2 = precoDoBilhete * 0.55;

        if(idadeDaPessoa <= 5){
            double descontoPreco = desconto - precoDoBilhete;
            System.out.println("You're are 5 years old.The ticket has received a 60% discount." + "The ticket price is now " + String.format("%.2f", desconto));
            double descontoPreco2 = scanner.nextDouble();
        }

        if(idadeDaPessoa >= 60){
            double descontoPreco = desconto2 - precoDoBilhete;
            System.out.println("You're are 60 years oldThe ticket has received a 55% discount. " + "The ticket price is now " + String.format("%.2f", desconto2));
            double descontoPreco2 = scanner.nextDouble();
        }

        else{
            System.out.println("The ticket´s price is 7 euros.");

        }






    }
}
