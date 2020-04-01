package a_Zadania.b_Dzien_2.a_Napisy;

public class Main3 {

    public static void main(String[] args) {
        String str = "Coders Labo";
        System.out.println(firstHalf(str));

    }

    static String firstHalf(String str) {
        String subText = str.substring(0, str.length()/2);
        return subText;
    }
}
