package a_Zadania.a_Dzien_1.b_Metody;


public class Main6 {

    public static void main(String[] args) {
        System.out.println(checkMaturity(18));
        System.out.println(checkMaturity(10));
    }

    private static boolean checkMaturity(int age) {
        final int MATURITY = 18;
        return age >= MATURITY;
    }
}
