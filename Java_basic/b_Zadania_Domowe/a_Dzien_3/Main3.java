package b_Zadania_Domowe.a_Dzien_3;


public class Main3 {

    public static void main(String[] args) {

   try{
       System.out.println(getLength(null));
   } catch (NullPointerException e) {
       System.out.println("Null pointer exception, change pointer value!");
   }

    }
    static int getLength(String str) {
        return str.length();
    }

}
