package a_Zadania.b_Dzien_2.a_Napisy;

public class Main5 {

    public static void main(String[] args) {
        String[] str = new String[]{"grudzień", "styczeń", "luty", "maj"};
        System.out.println(stringFromArray(str));

    }

    static String stringFromArray(String[] str) {
        return String.join(" ", str);
    }
}
