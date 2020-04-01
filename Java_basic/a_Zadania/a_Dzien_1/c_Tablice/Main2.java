package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;
import java.util.Random;

public class Main2 {

    public static void main(String[] args) {
        int[] randNumbers = new int[20];
        Random rand = new Random(); //generator liczb pseudolosowych, powołujemy obiekt klasy random
        for (int i = 0; i < randNumbers.length; i++) {
            randNumbers[i] = rand.nextInt(101);
        }

        int min = 100;
        for (int i = 0; i < randNumbers.length; i++) {
            if (min > randNumbers[i]) {
                min = randNumbers[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println(Arrays.toString(randNumbers)); //wypisuje elementy tablicy po przecinku i po spacji
    }
}
//całość można zoptymalizować jednym forem