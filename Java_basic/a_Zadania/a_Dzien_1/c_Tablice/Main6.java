package a_Zadania.a_Dzien_1.c_Tablice;


import java.util.Arrays;

public class Main6 {

    public static void main(String[] args) {
        int[] numbers = {2, 3};
        int[] secondNumbers = {2, 4};
        int[] result = new int[numbers.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = numbers[i] + secondNumbers[i];
        }
        System.out.println(Arrays.toString(result));

    }
}
