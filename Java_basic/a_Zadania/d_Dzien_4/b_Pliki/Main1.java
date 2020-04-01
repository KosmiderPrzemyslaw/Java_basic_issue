package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        try{

            FileWriter fileWriter = new FileWriter("Main1.txt", true);
            Scanner scanner = new Scanner(System.in);

            while (!scanner.hasNext("quit")){
                String line =  scanner.nextLine();
                fileWriter.append(line + "\n");
            }
            fileWriter.close();

        } catch (IOException e) {
            System.out.println("IO exception");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}