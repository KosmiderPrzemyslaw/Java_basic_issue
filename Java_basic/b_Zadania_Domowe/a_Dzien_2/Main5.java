package b_Zadania_Domowe.a_Dzien_2;


public class Main5 {

    public static void main(String[] args) {
        String name = "Mamamija";
        System.out.println(replaceChar(name, 'a', 'd'));
    }

    static String replaceChar(String str, char forReplace, char replacement) {
        char[] char1 = str.toCharArray();
        int[] number = new int[str.length()];
        String[] strSec = new String[str.length()];
        String strToReturn = new String();

        for (int i = 0; i < str.length(); i++) {
            if (char1[i] == forReplace) {
                char1[i] = replacement;
            }

            number[i] = char1[i];
            Character myChar = (char) number[i];
            strSec[i] = myChar.toString();
            strToReturn += strSec[i];

        }
        return strToReturn;
    }
}
