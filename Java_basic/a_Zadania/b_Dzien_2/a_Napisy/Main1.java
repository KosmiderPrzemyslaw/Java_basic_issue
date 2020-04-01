package a_Zadania.b_Dzien_2.a_Napisy;

public class Main1 {

    public static void main(String[] args) {

        String str = "CodersLab jak dobrze zacząć programować";
        char character = str.charAt(str.length() - 2);
        char[] characters = str.toCharArray();
        int counter = 0;

        for (int i = 0; i < characters.length; i++) {
            if (character == characters[i]) {
                counter++;
            }
        }
        System.out.println(String.format("Number of %c character equals %d", character, counter));
    }
}

