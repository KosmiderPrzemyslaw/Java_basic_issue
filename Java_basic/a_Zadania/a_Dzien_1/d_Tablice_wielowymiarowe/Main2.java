package a_Zadania.a_Dzien_1.d_Tablice_wielowymiarowe;

import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {

        int[][] task2Array = {
                {2, 3, 4},
                {12, 32, 12, 11},
                {3, 2, 1, 4, 5},
                {5, 1, 6, 7, 8}
        };
        for (int i = 0; i < task2Array.length; i++) {
            for (int j = 0; j < task2Array[i].length; j++) {
                System.out.print(task2Array[i][j] + "\t");
            }
            System.out.print("długość tablicy zagnieżdżonej: " + task2Array[i].length);
            System.out.println();
        }

    }

}
