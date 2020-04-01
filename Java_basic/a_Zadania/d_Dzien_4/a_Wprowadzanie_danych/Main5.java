package a_Zadania.d_Dzien_4.a_Wprowadzanie_danych;

import java.util.Scanner;

public class Main5 {

    public static void main(String[] args) {
        textLines();

    }

    static void textLines() {
        String text = "";
        Scanner scanner = new Scanner(System.in);

        while (!text.equals("quit")) {
            text = scanner.nextLine();

            if (!text.equals("quit")) {
                System.out.println("Tekst: " + text);
            }
        }
    }
}
