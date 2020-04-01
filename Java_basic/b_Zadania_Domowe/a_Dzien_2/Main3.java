package b_Zadania_Domowe.a_Dzien_2;


public class Main3 {

    public static void main(String[] args) {
        String name = "Coders Lab";
        int index = 2;
        System.out.println(upperCase(name, index));

    }

    static String upperCase(String str, int index) {
        char[] char1 = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (char1[i] % index == 0) {
                char1[i] = Character.toUpperCase(char1[i]);
            }
        }
        return new String(char1);
    }

}
