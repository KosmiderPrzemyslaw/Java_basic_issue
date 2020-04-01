package a_Zadania.c_Dzien_3.b_Wyjatki;


public class Main6 {

    public static void main(String[] args) {

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException ex) {
            System.out.println("Null pointer exception!");
        }
    }
}
