package JavaTopic6;

public class ClassTester {
     private String name;
     private String mindset;
     private String isTesterByChance;
     private double longToeNails;


    // 1ª construtor
    public ClassTester() {

    }

    // 2ª construtor
    public ClassTester(String name, String mindset, String isTesterByChance, double longToeNails) {
        this.name = name;
        this.mindset = mindset;
        this.isTesterByChance = isTesterByChance;
        this.longToeNails = longToeNails;
    }

    public void setName(String name){
         this.name = name;

     }
     public String getName(){
         return name;
     }
     public void setMindset(String mindset){
         this.mindset = mindset;
     }

     public  String getMindset(){
         return mindset;

    }

    public void setIsTesterByChance(String isTesterByChance) {

         this.isTesterByChance = isTesterByChance;
    }

    public String getIsTesterByChance() {
        return isTesterByChance;
    }


    public void setLongToeNails(double longToeNails) {
        this.longToeNails = longToeNails;
    }

    public double getLongToeNails() {
        return longToeNails;
    }

    public String calculateLongToenail(ClassTester classTester){
        if (this.longToeNails > classTester.getLongToeNails()){
            return this.name;
        } else {
            return classTester.getName();
        }

    }

    public void tellMeHowGreatIsEli(){
        System.out.println("Hey, Eli no seas tan presumida!!!");
    }

    public void printTester(ClassTester tester){
        System.out.println("-------> Printing tester information");
        System.out.println("Hello my name is " + tester.getName());
        System.out.println("I'm " + tester.getMindset());
        System.out.println("Are you a tester? " + tester.getIsTesterByChance());
        System.out.println("My nails are " + tester.getLongToeNails() + " cm long");
    }

}
