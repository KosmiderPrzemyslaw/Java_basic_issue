package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main3 {

    public static void main(String[] args) {

        copyFile("/home/przemysaw/Pulpit/test", "skad2", "skad");
    }


    static void copyFile(String directory, String file1, String file2) {
        Path firstFile = Paths.get(directory+ "/" + file1);
        Path secondFile = Paths.get(directory + "/" + file2);

        if(!Files.exists(secondFile)) {
            try {
                Files.copy(firstFile, secondFile);
            } catch (IOException e) {
                System.out.println("IO exception");
            }
        }

    }
}