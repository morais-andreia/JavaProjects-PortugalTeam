package JavaTopic5;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDois5_3 {

    public static void main(String[] args) {

        /*Exercise 5.3. Write a program that initialize 5 strings in an ArrayList.
        Add another element, remove the first, print the size of the arraylist,
        print the element in the index 3, and use Iterator class to print all
        the elements of the arraylist. Finally, check all the elements of the
        arraylist and find the elements that contains the letter “e”.*/

        ArrayList<String> lista = new ArrayList<String>();

        lista.add("Acerola");
        lista.add("Banana");
        lista.add("Manga");
        lista.add("Ananas");
        lista.add("Pessego");
        lista.add("Pera");

        System.out.println(lista);

        lista.add("Maracuja");

        lista.remove(3);
        System.out.println(lista);

        Iterator<String> iterator = lista.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());

        }
        System.out.println("");
        for(int i=0; i < lista.size(); i++){

            if (lista.get(i).contains("e")) {

                System.out.println(lista.get(i));
            }

        }
    }

}
