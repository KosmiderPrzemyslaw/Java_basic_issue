package a_Zadania.a_Dzien_1.b_Metody;


public class Main1 {

    public static void main(String[] args) {
        int sum = multiply(2, 2);
        System.out.println(sum);

        sum = multiply(10, 10);
        System.out.println(sum);

    }

    static int multiply(int multiplier, int index) {

        return multiplier * index;
    }
}