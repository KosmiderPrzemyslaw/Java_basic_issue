package b_Zadania_Domowe.a_Dzien_3;


public class Main2 {

    public static void main(String[] args) {

        String[] strTab = {"Przemek", "Ilona", "Konrad", "Kasia"};
        try {
            System.out.println(safeGet(strTab, 6));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array out of bounds, change index value!");
        }

    }
    static String safeGet(String[] strTab, int index) {
        return strTab[index];
    }
}
