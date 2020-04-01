package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

public class Main6 {

    public static void main(String[] args) {

        double a = ScannerUtils.getInt("Podaj parametr a: ");
        double b = ScannerUtils.getInt("Podaj parametr b: ");
        double c = ScannerUtils.getInt("Podaj parametr c: ");
        equation(a, b, c);

    }

    static void equation(double a, double b, double c) {

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = (-b - Math.sqrt(delta)) / (2 * a);
        double x2 = (-b + Math.sqrt(delta)) / (2 * a);
        double x0 = (-b / (2 * a));

        if (delta > 0) {
            System.out.println(x1);
            System.out.println(x2);
        } else if (delta == 0) {
            System.out.println(x0);
        } else {
            System.out.println("Równanie nie ma rozwiązania.");
        }
    }
}
