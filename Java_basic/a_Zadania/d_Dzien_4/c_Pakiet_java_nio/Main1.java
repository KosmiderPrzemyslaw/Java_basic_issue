package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {

    public static void main(String[] args) {

        createDirectory("/home/przemysaw/Pulpit/katalognowy");
    }

    static void createDirectory(String dirName) {

        Path dir = Paths.get(dirName);
        if (!Files.exists(dir)) {
            try {
                Files.createDirectory(dir);
            } catch (IOException e) {
                System.out.println("Create directory filed");
            }
        }
    }
}