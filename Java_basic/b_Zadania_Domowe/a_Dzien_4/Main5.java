package b_Zadania_Domowe.a_Dzien_4;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

public class Main5 {

    public static void main(String[] args) {

        printTriangle();

    }

    static void printTriangle() {
        String sign = "x";
        String newLine = "\n";
        int a = ScannerUtils.getInt("Podaj wartość: ");
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(sign);
            }
            stringBuilder.append(newLine);
        }
        System.out.println(stringBuilder);

    }

}





