package a_Zadania.d_Dzien_4.b_Pliki;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        try {
            File file = new File("text2.txt");
            Scanner scanner = new Scanner(file);
            List<String> list = new ArrayList<>();

            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            Collections.sort(list);

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

//Arraylist
//tablica stringów array.sort
// size() - return number of elements in list.
// .get90 - returns the element at specified position in this list.