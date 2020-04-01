package a_Zadania.a_Dzien_1.b_Metody;


public class Main9 {

    public static void main(String[] args) {
        System.out.println(String.format("n! z %d: %d", 10, factorial(10)));
    }

    static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
