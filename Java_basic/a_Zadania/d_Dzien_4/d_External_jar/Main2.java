package a_Zadania.d_Dzien_4.d_External_jar;

import org.apache.commons.lang3.StringUtils;
public class Main2 {

    public static void main(String[] args) {
    String str = "HoLA LolA AhoLA";
        System.out.println(toggleChar(str));

    }
    static String toggleChar(String str) {
        return StringUtils.swapCase(str);
    }

}
