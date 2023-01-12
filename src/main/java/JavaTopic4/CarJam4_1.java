package JavaTopic4;
import java.util.Scanner;
public class CarJam4_1 {
    public static void main(String args[]) {
        //Initialize what we know
        int numberOfCars = 0;
        int numberOfPeople = 2;
        //Process all cars
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cars");
        numberOfCars = scanner.nextInt();

        for (int i = 0; i < numberOfCars; i++) {
            System.out.println("Enter the age of each person");
            System.out.println("Age of person A");
            double age1 = scanner.nextDouble();
            System.out.println("Age of person B");
            double age2 = scanner.nextDouble();
            //Process people's age
            double age = 0;
            age = (age1 + age2) / 2;
            System.out.println("The age average for car #" + (i + 1) + " is " + age);
        }
        scanner.close();
    }
}
