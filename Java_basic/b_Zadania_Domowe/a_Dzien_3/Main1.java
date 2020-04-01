package b_Zadania_Domowe.a_Dzien_3;



public class Main1 {

    public static void main(String[] args) {
        String a = "8";
        String b = "0";
        try {
            average(a,b);
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero!");
        }
    }
    static void average(String a, String b) {
        System.out.println(Integer.parseInt(a)/ Integer.parseInt(b));
    }


}
