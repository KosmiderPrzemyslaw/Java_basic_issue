package b_Zadania_Domowe.a_Dzien_2;


public class Main2 {


    public static void main(String[] args) {
        String name = "Szyfr Cezara";
        int shift = 5;
        System.out.print("Tekst zaszyfrowany: " + encode(name, shift) + "\n");
        System.out.print("Tekst odszyfrowany: " + decode(name, shift));

    }

    static String encode(String str, int shift) {
        char[] strToCharArray = str.toCharArray();
        int[] toNumber = new int[str.length()];
        String encodeStrToReturn = new String();

        for (int i = 0; i < strToCharArray.length; i++) {

            toNumber[i] = strToCharArray[i] + shift;
            Character myChar = (char) toNumber[i];
            encodeStrToReturn += myChar.toString();

        }
        return encodeStrToReturn;
    }

    static String decode(String str, int shift) {
        int[] number = new int[str.length()];
        char[] strToCharArray = str.toCharArray();
        String decodeStrToReturn = new String();

        for (int i = 0; i < str.length(); i++) {

            number[i] = strToCharArray[i] + shift;
            number[i] = number[i] - shift;
            Character myChar2 = (char) number[i];
            decodeStrToReturn += myChar2.toString();
        }
        return decodeStrToReturn;
    }
}



