package a_Zadania.a_Dzien_1.b_Metody;


public class Main7 {

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(10));
        System.out.println(checkEvenOdd(5));
        System.out.println(checkEvenOdd(2));

    }

    private static String checkEvenOdd(int number) {
        boolean isEven = number % 2 == 0;
        if (isEven) {
            return "even";
        }

        return "odd";

        //return number % 2 == 0 ? "even" : "odd";
    }
}
