package b_Zadania_Domowe.a_Dzien_2;

public class Main6 {

    public static void main(String[] args) {
        String Ala = "Ala ma kota";
        System.out.println(replaceStr(Ala, "kota", "psa"));

    }


    static String replaceStr(String str, String forReplace, String replacement) {
        String replaceAllText = str.replaceAll(forReplace, replacement);
        return replaceAllText;
    }
}



