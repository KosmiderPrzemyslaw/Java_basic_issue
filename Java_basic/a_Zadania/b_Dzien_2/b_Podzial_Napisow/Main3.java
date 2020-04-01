package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main3 {

    public static void main(String[] args) {
        String str = "Ala ma kota";
        System.out.println(countTokens(str));

    }
    static int countTokens(String str) {
        String text = str;
        StringTokenizer sToken = new StringTokenizer(text);
        return sToken.countTokens();
    }
}