package b_Zadania_Domowe.a_Dzien_4;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main7 {

    public static void main(String[] args) {
        try {
            rewrite();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static boolean rewrite() throws IOException {
        String fileName = ScannerUtils.getStringSec("Enter the file name: ");
        Path source = Paths.get(fileName);
        Path destination = Paths.get(fileName + "_2");

        if (!Files.exists(source)) {
            throw new IOException("File doesn't exist!");

        }
        List<String> fileContent = new ArrayList<>(Files.readAllLines(source));
        fileContent.addAll(fileContent);
        Files.write(destination, fileContent);
        return true;
    }
}

