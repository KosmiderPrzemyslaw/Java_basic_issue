package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

import java.util.Scanner;

public class Main7 {

    public static void main(String[] args) {
        nettoBrutto();

    }

    static void nettoBrutto() {
        String direction = ScannerUtils.getString("Set calculate direction: ", "(nb)|(bn)");
        System.out.print("Enter amount to calculate: ");
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("The inscription does not match the pattern!");
            System.out.print("Enter correct value: ");
        }


        if (direction.equals("nb")) {
            System.out.println(scanner.nextDouble() * 1.23);
        } else {
            System.out.println(scanner.nextDouble() / 1.23);
        }

    }

}
