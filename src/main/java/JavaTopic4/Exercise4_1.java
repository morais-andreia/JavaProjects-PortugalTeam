package JavaTopic4;

import java.util.Scanner;

public class Exercise4_1 {


    //o sistema deve ler uma quantidade de carros em um engarrafamento, e pensando que
    // cada carro tem 2 pessoas,
    // preencha a idade das pessoas. Por fim, imprima a média das pessoas.

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Type the numbs of cars: ");
        int numCars  = scanner.nextInt();
        int numOfPeople = numCars * 2;
        int agePeople;
        int avarage = 0;

        for ( int i = 0; i < numOfPeople; i++){
            System.out.println("Type the age of people " + i + ": ");
            agePeople = scanner.nextInt();
            avarage = avarage + agePeople;
        }
        avarage = avarage / numOfPeople;
        System.out.println("The avarage: " + avarage);

        scanner.close();

    }
}
