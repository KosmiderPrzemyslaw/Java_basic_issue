package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

public class Main4 {

    public static void main(String[] args) {

        rowsColumns();
    }

    static void rowsColumns() {
        int sum = 0;
        int number = 1;
        double average;
        int rows = ScannerUtils.getInt("Podaj liczbę wierszy: ");
        int columns = ScannerUtils.getInt("Podaj liczbe kolumn: ");
        int[][] tab = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                tab[i][j] = number++;
                sum += tab[i][j];
            }
        }
        average = sum / (double) (rows * columns);
        System.out.println(sum);
        System.out.println(average);
    }
}
