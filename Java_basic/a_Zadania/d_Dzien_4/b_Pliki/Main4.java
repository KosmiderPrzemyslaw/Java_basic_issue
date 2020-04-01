package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {
        try {
            File file = new File("text1.txt");
            Scanner scanner = new Scanner(file);

            while(scanner.hasNextLine()) {
                String check = scanner.nextLine();
                if(check.toLowerCase().contains("javy")) {
                    System.out.println(check);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
        }
    }
}
