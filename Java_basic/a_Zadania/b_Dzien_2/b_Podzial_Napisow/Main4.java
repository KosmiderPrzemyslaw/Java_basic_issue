package a_Zadania.b_Dzien_2.b_Podzial_Napisow;


import java.util.Arrays;

public class Main4 {

    public static void main(String[] args) {
        String str = "Java-zadania-podzial-napisow";
            System.out.println(Arrays.toString(onlyTwoElements(str, '-')));
        }

    static String[] onlyTwoElements(String str, char separator) {
        String value = Character.toString(separator);
        return str.split(value, 2);
    }
}