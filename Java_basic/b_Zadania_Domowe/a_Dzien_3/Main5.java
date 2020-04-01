package b_Zadania_Domowe.a_Dzien_3;


public class Main5 {

    public static void main(String[] args) throws Exception {
        int[] tab = {2, 4, 5, 6};
        int number = elementExist(tab, 1);
        System.out.println(number);
    }

    static int elementExist(int[] elements, int value) throws
            Exception {
        for (int i = 0; i < elements.length; i++) {
            int elementToReturn;
            if (elements[i] == value) {
                elementToReturn = elements[i];
                return elementToReturn;
            }
        }
        throw new Exception("There is no such element");
    }
}


