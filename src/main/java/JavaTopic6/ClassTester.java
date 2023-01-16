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

}
