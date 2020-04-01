package a_Zadania.b_Dzien_2.a_Napisy;

public class Main7 {

    public static void main(String[] args) {

        String str = "A to kanapa pana kota";
        String newStr = str.replaceAll(" ", "");
        System.out.println(newStr.equalsIgnoreCase(reverse(newStr)));


    }

    static String reverse(String newStr) {
        char[] character = newStr.toCharArray();
        char[] reversed = new char[character.length];
        for (int i = character.length - 1; i >= 0; i--) {
            reversed[reversed.length - 1 - i] = character[i];
        }
        return new String(reversed);

    }


}


