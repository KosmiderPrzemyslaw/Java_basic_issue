package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] reversed = new int[numbers.length]; //tworzymy pusta tab o rozmiarze tablicy numbers

        for (int i = 0; i < numbers.length; i++) {
            reversed[i] = numbers[numbers.length - 1 - i];
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(reversed));
    }
}
