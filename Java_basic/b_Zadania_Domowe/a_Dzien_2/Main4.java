package b_Zadania_Domowe.a_Dzien_2;


public class Main4 {

    public static void main(String[] args) {

        String inscription = "faaalllaaafellkiii";
        System.out.println(tripple(inscription));
    }

    static int tripple(String str) {
        int counter = 0;
        int[] number = new int[str.length()];
        int[] number2 = new int[str.length()];
        int[] number3 = new int[str.length()];
        int j = 1;
        int k = 2;
        int i = 0;
        char[] character = str.toCharArray();

        while (k < str.length()) {

            number[i] = character[i];
            Character myChar = (char) number[i];

            number2[j] = character[j];
            Character myChar2 = (char) number2[j];

            number3[k] = character[k];
            Character myChar3 = (char) number3[k];

            if ((myChar == myChar2) && (myChar2 == myChar3) && (myChar == myChar3)) {
                counter++;
            }
            k++;
            j++;
            i++;
        }
        return counter;
    }
}
