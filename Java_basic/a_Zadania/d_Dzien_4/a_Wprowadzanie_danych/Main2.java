package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

public class Main2 {

    public static void main(String[] args) {
        int a = ScannerUtils.getInt("Enter first number: ");
        int b = ScannerUtils.getInt("Enter second number: ");
        operations(a, b);
    }
    static void operations(int a, int b) {
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        try
        {
            System.out.println(a/b);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero!");
        }
    }
}
