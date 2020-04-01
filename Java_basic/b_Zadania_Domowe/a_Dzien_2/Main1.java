package b_Zadania_Domowe.a_Dzien_2;


import org.apache.commons.lang3.StringUtils;

import java.nio.charset.Charset;

public class Main1 {

    public static void main(String[] args) {
        String napis = "Szyfr Cezara";
        System.out.println(encode(napis));


    }

    static String encode(String str) {
        int[] number = new int[str.length()];
        byte[] bajt = new byte[str.length()];
        char[] character = str.toCharArray();
        String strToReturn = new String();

        for (int i = 0; i < character.length; i++) {
            number[i] = character[i] + 3;
            Character myChar = (char) number[i];
            strToReturn += myChar.toString();

        }
        return strToReturn;
    }
}


