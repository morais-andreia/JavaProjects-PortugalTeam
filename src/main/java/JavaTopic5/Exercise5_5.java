package JavaTopic5;

import java.util.ArrayList;

public class Exercise5_5 {
    public static void main(String[] args) {


        String stringA = "String e1";
        String stringB = "String e2";
        String stringC = "String x1";
        String stringD = "String x2";
        String stringE = "String x3";


        ArrayList<String> thing = new ArrayList<String>();
        thing.add(stringA);
        thing.add(stringB);
        thing.add(stringC);
        thing.add(stringD);
        thing.add(stringE);

        String text = "";

        for (int i = 0; i < thing.size(); i++) {
            text = text.concat(thing.get(i) + " ");


        }
        text = text.trim();
        System.out.println(text.replaceAll("e", "x"));


    }
}
