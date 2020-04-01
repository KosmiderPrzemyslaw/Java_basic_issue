package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        int age = ScannerUtils.getInt("How old are you: ");
        System.out.print("What's your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println(String.format("%s has %d", name, age));
    }
}