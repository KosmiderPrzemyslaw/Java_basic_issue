package a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main3 {

    public static void main(String[] args) {
        try {
            showLength(null);
        } catch (NullPointerException e) {
            System.out.println("Wartość wynosi null!!");
        }
    }

    static void showLength(String s) {
        System.out.println(s.length());
    }
}
