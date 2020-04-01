package a_Zadania.a_Dzien_1.b_Metody;


public class Main3 {

    public static void main(String[] args) {
        double usd = convertToUsd(10);
        System.out.println(usd);
        System.out.println(String.format("Wrtość w dolarach: %.2f", usd));


    }

    static double convertToUsd(double pln) {
        final double PLN_TO_USD_RATIO = 4.04;
        return pln / PLN_TO_USD_RATIO;
    }

}


