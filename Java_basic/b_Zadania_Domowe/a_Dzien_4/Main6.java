package b_Zadania_Domowe.a_Dzien_4;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Main6 {

    public static void main(String[] args) {
        System.out.println(checkFileExist());
    }

    static boolean checkFileExist() {
        String fileName = ScannerUtils.getStringSec("Enter the file name to loaded");
        return Files.exists(Paths.get(fileName));
    }
}


