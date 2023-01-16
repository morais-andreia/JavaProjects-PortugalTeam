package JavaTopic5;

public class StringCompare5_4 {
    //Exercise 5.4. Declare two equals strings, one in uppercase and another one in lower case.
    // Try to use equalsIgnoreCase()  and equals() to know if both strings are the same or not.
    //Now declare the following variables:
    //String string1= “ELI”;
    //String string2= new String(“ELI”);
    //Can you try to compare with "=="?. It works in the same way that equals()? Why? Bring your answers to the daily :)

    public static void main(String[] args) {
        String upperCase = "ANDREIA";
        String lowerCase = "andreia";
        String a1 ="ELI";
        String a2 = "ELI";

        System.out.println(upperCase.equals(lowerCase));
        System.out.println(upperCase.equalsIgnoreCase(lowerCase));
        System.out.println(a1 == a2);
        System.out.println("------------------------------------------------------");
        System.out.println("Yes, the == operators work the same way as equals.\n" +
                "results will be false if any string being compared is in a " +
                "different format and length than the other.");



    }
}
