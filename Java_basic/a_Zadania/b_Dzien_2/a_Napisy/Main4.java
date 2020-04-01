package a_Zadania.b_Dzien_2.a_Napisy;

public class Main4 {

    public static void main(String[] args) {
        String search = "p";
        String str = "fok";
        System.out.println(containsStr(str, search));

    }

    static boolean containsStr(String str, String search) {
        return str.contains(search);
    }
}
