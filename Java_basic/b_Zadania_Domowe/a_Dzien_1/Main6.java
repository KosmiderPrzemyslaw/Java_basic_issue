package b_Zadania_Domowe.a_Dzien_1;


public class Main6 {

    public static void main(String[] args) {
        int[][] table = {
                {2, 3, 4},
                {12, 32, 12, 11},
                {3, 2, 1, 4, 5},
                {5, 9, 6, 7, 8},
                {15, 21, 36, 47, 9},
                {5, 11, 26, 7, 58},
                {45, 11, 56, 7, 88}
        };
        System.out.println((oddSum(table)));
    }

    static int oddSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 != 0) {
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }
}
