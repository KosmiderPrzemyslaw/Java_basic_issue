package b_Zadania_Domowe.a_Dzien_2;

import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main7 {

    public static void main(String[] args) {
        String[] words = {"Palicho", "kurczak", "masakra", "wode"};
        String str = "Palicho powiedzial Jędrek gdy kurczak wypil cala wode";

        System.out.println(censor(str, words));
    }

    static String censor(String str, String[] words) {
        String[] strToReturn = str.split(" ");
        for (int i = 0; i < strToReturn.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (strToReturn[i].equals(words[j])) {
                    strToReturn[i] = "****";
                }
            }
        }
        return String.join(" ", strToReturn);
    }
}









