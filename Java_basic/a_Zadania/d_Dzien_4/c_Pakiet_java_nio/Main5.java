package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main5 {

    public static void main(String[] args) {
        readFromFile("/home/przemysaw/Pulpit/test2/tekst.txt");

    }

    static void readFromFile(String fileName) {
        Path file = Paths.get(fileName);

        if (Files.exists(file)) {

            try {
                List<String> list = new ArrayList<>(Files.readAllLines(file));

                for (int i = 0; i < list.size(); i++) {
                    list.set(i, "<p>" + list.get(i) + "</p>");

                }
                list.add(0, "<html><body");
                list.add("</body></html>");
                Files.write(Paths.get(fileName + ".html"), list);
            } catch (IOException e) {
                System.out.println("IO Exception");
            }
        } else {
            System.out.println("File not found");
        }
    }
}

