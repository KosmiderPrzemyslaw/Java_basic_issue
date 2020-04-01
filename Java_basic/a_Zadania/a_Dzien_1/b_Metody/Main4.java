package a_Zadania.a_Dzien_1.b_Metody;


public class Main4 {

    public static void main(String[] args) {
        String result = createName("Jan", "Nowak", "Jezioranski");
        System.out.println(result);

    }

    private static String createName(String name, String surname, String nickname) {
        return name + " " + nickname + " " + surname;
//        return String.format("%s %s %s", name, nickname, surname);
//        return String.join(" ", name, nickname, surname);
    }
}
