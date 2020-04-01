package a_Zadania.c_Dzien_3.b_Wyjatki;

public class Main2 {

    public static void main(String[] args) {

        try {
            System.out.println(divide(17, 4));
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel przez zero");
        }
    }

    static int divide(int a, int b) {
        return a / b;
    }
}
