package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

public class Main3 {

    public static void main(String[] args) {
        getData();

    }

    static void getData() {
        int sum = 0;
        int number;
        int counter = 0;
        do {
            number = ScannerUtils.getInt("Enter number: ");
            sum += number;
            counter++;
        } while (number != 0);
        counter = counter - 1;
        System.out.println("Sum of numbers: " + sum);
        System.out.println("Numbers: " + counter);
    }
}