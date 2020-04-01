package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int[][] table = {
                {2, -3, 4},
                {12, -32, 12, 11},
                {3, 2, 1, 4, 5},
                {5, 9, 6, 7, 8},
                {15, 21, -36, 47, 9},
                {5, -11, 26, 7, 58},
                {45, 11, 56, -7, 88}
        };
        System.out.println(Arrays.toString(lessMore(table)));
    }

    static int[] lessMore(int[][] arr) {

        double size = 0;
        double sum = 0;
        double average;
        int counter1 = 0;
        int counter2 = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            size += arr[i].length;
        }

        average = sum / size;
        //System.out.println(average);
        //System.out.println(sum);
        //System.out.println(size);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (average > arr[i][j]) {
                    counter1++;
                } else {
                    counter2++;
                }
            }
        }
        int[] tab = {counter1, counter2};

        return tab;
    }
}

