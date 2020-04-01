package a_Zadania.b_Dzien_2.a_Napisy;

public class Main8 {

    public static void main(String[] args) {
        String str = "Tak";
        System.out.println(toggleChar(str));


    }

    static String toggleChar(String str) {
        char[] character = str.toCharArray();
        for (int i = 0; i < character.length; i++) {
            if (Character.isUpperCase(character[i])) {
                character[i] = Character.toLowerCase(character[i]);
            } else {
                character[i] = Character.toUpperCase(character[i]);
            }
        }
        return new String(character);
    }
}
