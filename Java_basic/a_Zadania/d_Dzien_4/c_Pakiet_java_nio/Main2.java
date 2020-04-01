package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main2 {

    public static void main(String[] args) {

        createFile("/home/przemysaw/Pulpit/plik.txt");
    }

    static void createFile(String fileName) {
        Path file = Paths.get(fileName);

        if (!Files.exists(file)) {
            try {
                Files.createFile(file);

            } catch (IOException e) {
                System.out.println("Create file filed");
            }
        }
    }
}
