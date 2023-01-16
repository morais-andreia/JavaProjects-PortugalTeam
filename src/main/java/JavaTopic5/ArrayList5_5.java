package JavaTopic5;

import java.util.ArrayList;

public class ArrayList5_5 {

    //Exercise 5.5. Write a program that initialize 5 strings in an ArrayList.
    // From String class, use replace method to replace the "e" letter for "x" letter.
    // Now include some spaces before each of the elements of the arrrayList with concat(),
    // print it and use the method trim() to remove the spaces.

    public static void main (String[] args){



        String stringA =  "String e1";
        String stringB = "String e2";
        String stringC = "String x1";
        String stringD = "String x2";
        String stringE = "String x3";



        ArrayList<String> thing = new ArrayList <String>();
        thing.add(stringA);
        thing.add(stringB);
        thing.add(stringC);
        thing.add(stringD);
        thing.add(stringE);

        String text = "";

        for(int i = 0; i < thing.size(); i++){
            text = text.concat(thing.get(i) + " ");


        }
        text = text.trim();
        System.out.println(text.replaceAll("e", "x"));





    }

}
