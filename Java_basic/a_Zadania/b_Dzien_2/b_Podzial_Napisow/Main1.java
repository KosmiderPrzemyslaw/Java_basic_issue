package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) {

        String str = "Naucz się programować od podstaw i rozwiń wymarzoną karierę w branży IT.";
        String[] words = splitUsingSplit(str);
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("*********");
        words = splitUsingTokenizer(str);
        for (String word : words) {
            System.out.println(word);
        }

    }

    static String[] splitUsingSplit(String str) {
        return str.split(" ");
    }

    static String[] splitUsingTokenizer(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str);
        String[] words = new String[tokenizer.countTokens()];

        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            words[i] = word;
            i++;
        }
        return words;
    }
}
