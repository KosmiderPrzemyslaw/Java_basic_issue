package b_Zadania_Domowe.a_Dzien_1;


import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        int[] table = {2, -3, 4, 12, 32, 42, 123, 231, 23};


        System.out.println(Arrays.toString(append(table)));
    }

    static int[] append(int[] arr) {
        int[] reversed = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        int[] tab = Arrays.copyOf(arr, arr.length * 2);
        int k = tab.length - arr.length;

        int[] arrTmp = new int[tab.length - k + reversed.length];
        System.arraycopy(tab, 0, arrTmp, 0, tab.length - k);
        System.arraycopy(reversed, 0, arrTmp, tab.length - k, reversed.length);

        return arrTmp;
    }
}
