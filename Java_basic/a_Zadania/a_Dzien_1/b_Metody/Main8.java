package a_Zadania.a_Dzien_1.b_Metody;


public class Main8 {

    public static void main(String[] args) {
        int a = 32;
        int b = 12;
        int c = 11;

        System.out.println(maxOfThree(a, b, c));

    }

    static int maxOfThree(int a, int b, int c) {
        if ((a > b) && (a > c)) {
            return a;
        } else if ((b > c) && (b > a)) {
            return b;
        }
        return c;


    }

}
