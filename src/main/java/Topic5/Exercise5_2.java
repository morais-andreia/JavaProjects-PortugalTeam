package JavaTopic5;
public class Exercise5_2 {
    //Exercício 5.2. Escreva um programa que leia uma frase (pelo menos 4 palavras), divida a string por
    // espaços e armazene cada pedaço de string em um Array. Posteriormente imprima o terceiro elemento,
    // altere o segundo elemento para 0, imprima todos os elementos e ordene-os.
    public static void main(String[] args) {

        String str = "Hello, this is the Portugal team, We are great!";
        String[] newStr = str.split("\\s+");
        for (int i = 0; i < newStr.length; i++) {
        }
        System.out.println(newStr[3]);
    }
}
