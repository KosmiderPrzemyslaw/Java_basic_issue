package a_Zadania.a_Dzien_1.c_Tablice;


public class Main1 {

    public static void main(String[] args) {
        int[] mainTab = new int[50];
        for (int i = 0; i < mainTab.length; i++) {
            mainTab[i] = i;
        }
        for (int i = 0; i < mainTab.length; i++) {
            String number = String.format("%02d,\t", mainTab[i]); //2 znaki szerokośc pola, 0 chcemy zero wiodące
            if (i > 0 && i % 10 == 0) {
                System.out.println();
            }
            System.out.print(number);
        }
    }
}
