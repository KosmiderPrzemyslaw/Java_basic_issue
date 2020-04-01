package b_Zadania_Domowe.a_Dzien_1;


public class Main2 {

    public static void main(String[] args) {
        System.out.println(divisibleBy(8, 2));
        System.out.println(divisibleBy(1, 2));
        System.out.println(divisibleBy(14, 2));

    }

    static boolean divisibleBy(int a, int b) {
        return a % b == 0 ? true : false;
    }
}