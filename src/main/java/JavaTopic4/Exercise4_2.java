package JavaTopic4;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Exercise4_2 {
    //Exercise 4.2.  Try to do the exercise of Java Course: chapter 5a but add another two methods.
    // The first one should print the edge of the person, and the second one if she is or not a zombie.

    public static void main(String[] args) {
        String date = edgeDate();
        checkZumbi(date);
    }

    public static String edgeDate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your year of your edge date: ");
        String year = scanner.next();
        System.out.println("Type your month of your edge date: ");
        String month = scanner.next();
        System.out.println("Type your day of your edge date: ");
        String day = scanner.next();
        scanner.close();
        String date = year + month + day;
        return date;

    }

    public static void checkZumbi(String date){
        Date todayDate = new Date();
        String todayDateStr = new SimpleDateFormat("yyyyMMdd").format(todayDate);

        int numbDate = Integer.parseInt(date);
        int numbTodayDate = Integer.parseInt(todayDateStr);

        if (numbDate <= numbTodayDate) {
            System.out.println("You are a Zumbi");
        }else {
            System.out.println("You aren't a Zumbi");
        }

    }


}
