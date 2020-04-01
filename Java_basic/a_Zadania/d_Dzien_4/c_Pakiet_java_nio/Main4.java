package a_Zadania.d_Dzien_4.c_Pakiet_java_nio;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args)
    {
        writeToFile("/home/przemysaw/Pulpit/test/skad2.txt");
    }
    static void writeToFile(String fileName) {
        Path file = Paths.get(fileName);
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        System.out.println("Enter data to add: ");

        while (!scanner.hasNext("quit")){
            list.add(scanner.nextLine());
        }
        try{
            if (!Files.exists(file)) {
                Files.createFile(file);

            }
            Files.write(file, list, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("File not found!");
        }
    }
}
