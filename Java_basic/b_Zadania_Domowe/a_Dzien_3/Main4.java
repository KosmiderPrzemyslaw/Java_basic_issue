package b_Zadania_Domowe.a_Dzien_3;


public class Main4 {

    public static void main(String[] args) {

        try {
            System.out.println(toInt("Napis"));
        }catch (NumberFormatException e) {
            System.out.println("Number format exception!");
        }

    }
    static int toInt(String str) {
        return Integer.parseInt(str);
    }
}
