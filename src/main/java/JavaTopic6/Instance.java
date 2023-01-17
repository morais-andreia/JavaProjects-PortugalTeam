package JavaTopic6;

import java.util.ArrayList;

public class Instance {
    public static void main(String[] args) {

        ClassTester andreia = new ClassTester(); //Variables start in lower case :)
        andreia.setName("Andreia QA");
        andreia.setMindset("Always Happy");
        andreia.setIsTesterByChance("Not yet,I'm in training");
        andreia.setLongToeNails(5.01);

        //5.a
        andreia.setIsTesterByChance("Now I'm");

        System.out.println("\n");
        System.out.println("Hello my name is " + andreia.getName());
        System.out.println("I'm " + andreia.getMindset());
        System.out.println("Are you a tester? " + andreia.getIsTesterByChance());
        System.out.println("I have " + andreia.getLongToeNails() + " cm of nails");


        System.out.println("\n");
        ClassTester bruno = new ClassTester("Bruno QA","Always sleepy","Not yet",5.00);

        //5.b
        bruno.setMindset("Always crazy!");

        System.out.println("Hello my name is " + bruno.getName());
        System.out.println("I'm " + bruno.getMindset());
        System.out.println("Are you a tester? " + bruno.getIsTesterByChance());
        System.out.println("My nails are " + bruno.getLongToeNails() + " cm long");

        //6.a
        String result = andreia.calculateLongToenail(bruno);
        System.out.println("\n");
        System.out.println(result + " has bigger nails");

        ArrayList<ClassTester> arrayTester = new ArrayList<>();
        arrayTester.add(andreia);
        arrayTester.add(bruno);

        for(int i=0 ; i<arrayTester.size(); i++){
            System.out.println("Hello my name is " + arrayTester.get(i).getName());
            System.out.println("I'm " + arrayTester.get(i).getMindset());
            System.out.println("Are you a tester? " + arrayTester.get(i).getIsTesterByChance());
            System.out.println("My nails are " + arrayTester.get(i).getLongToeNails() + " cm long");
        }

        for(ClassTester tester: arrayTester){
            System.out.println("Hello my name is " + tester.getName());
            System.out.println("I'm " + tester.getMindset());
            System.out.println("Are you a tester? " + tester.getIsTesterByChance());
            System.out.println("My nails are " + tester.getLongToeNails() + " cm long");
        }

        arrayTester.add(new ClassTester("Eli QA","Always i the middle","Of course",15.00));

        for(int j= 0; j<arrayTester.size(); j++){
            new ClassTester().printTester(arrayTester.get(j));
        }

        new ClassTester().tellMeHowGreatIsEli();


    }
}
