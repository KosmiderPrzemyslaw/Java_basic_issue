package a_Zadania.b_Dzien_2.a_Napisy;

import org.apache.commons.lang3.StringUtils;

public class Main6 {

    public static void main(String[] args) {

        String str = "codersLabxyz";
        System.out.print(reverse(str));

    }

    static String reverse(String str) {
        char[] character = str.toCharArray();
        System.out.println(character);
        char[] reversed = new char[character.length];
        for (int i = character.length - 1; i >= 0; i--) {
            reversed[reversed.length - 1 - i] = character[i];
        }
        return new String(reversed);
        //return StringUtils.reverse(str);
    }
}
