package JavaTopic6;

public class Instance {
    public static void main(String[] args) {

        ClassTester Andreia = new ClassTester();
        Andreia.setName("Andreia QA");
        Andreia.setMindset("Always Happy");
        Andreia.setIsTesterByChance("Not yet,I'm in training");
        Andreia.setLongToeNails(5.01);

        //5.a
        Andreia.setIsTesterByChance("Now I'm");

        System.out.println("\n");
        System.out.println("Hello my name is " + Andreia.getName());
        System.out.println("I'm " + Andreia.getMindset());
        System.out.println("Are you a tester? " + Andreia.getIsTesterByChance());
        System.out.println("I have " + Andreia.getLongToeNails() + " cm of nails");


        System.out.println("\n");
        ClassTester Bruno = new ClassTester("Bruno QA","Always sleepy","Not yet",5.00);

        //5.b
        Bruno.setMindset("Always crazy!");

        System.out.println("Hello my name is " + Bruno.getName());
        System.out.println("I'm " + Bruno.getMindset());
        System.out.println("Are you a tester? " + Bruno.getIsTesterByChance());
        System.out.println("My nails are " + Bruno.getLongToeNails() + " cm long");

        //6.a
        String result = Andreia.calculateLongToenail(Bruno);
        System.out.println("\n");
        System.out.println(result + " has bigger nails");
    }
}
