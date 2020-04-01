package a_Zadania.b_Dzien_2.a_Napisy;

public class Main2 {

    public static void main(String[] args) {
        String str = "This is coders Lab";
        char a = 'a';
        System.out.println("The letter " + a + " is located at : " + charPos(str, a));
    }

    static int charPos(String str, char a) {
        char[] characters = str.toCharArray();
        int number = 0;

        for (int i = characters.length - 1; i > 0; i--) {
            if (a == characters[i]) {
                number = i;
            }
        }
        return number;
    }
}
