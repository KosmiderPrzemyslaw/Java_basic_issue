package b_Zadania_Domowe.a_Dzien_1;


public class Main1 {

    public static void main(String[] args) {
    System.out.println(String.format("%.2f", dogAge(5)));

    }

    static double dogAge(double dogAge) {
        double result = 0;
        if (dogAge >= 2) {
            result = (2 * 10.5) + ((dogAge - 2) * 4);
        } else if (dogAge < 2) {
            result = dogAge * 10.5;
        }
        return result;
    }
}
