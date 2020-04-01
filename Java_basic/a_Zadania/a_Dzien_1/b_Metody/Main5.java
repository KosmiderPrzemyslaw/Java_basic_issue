package a_Zadania.a_Dzien_1.b_Metody;


public class Main5 {

    public static void main(String[] args) {
        System.out.println(
                String.format("%.2f brutto to %.2f netto", 123d, calculateNet(123, 0.23))
        );
    }

    private static double calculateNet(double gross, double vat) {
        return gross / (1 + vat);
    }

}