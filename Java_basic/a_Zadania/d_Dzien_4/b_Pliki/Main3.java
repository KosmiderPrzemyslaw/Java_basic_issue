package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {
        try {
            File file = new File("Main3.txt");
            Scanner scanner = new Scanner(file);
            double sum = 0;

            while (scanner.hasNextLine()) {
                String[] splitArray = scanner.nextLine().split(",");

                for (int i = 0; i < splitArray.length; i++) {

                    try {
                        sum += Double.parseDouble(splitArray[i]);
                    } catch (NumberFormatException e) {

                    }
                }
            }
            System.out.println(sum);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }

    }
}
