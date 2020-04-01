package a_Zadania.d_Dzien_4.d_External_jar;

import org.apache.commons.lang3.StringUtils;

public class Main3 {

    public static void main(String[] args) {

        String[] str = {"Coders, Lab"};
        System.out.println(stringFromArray(str));
    }

    static String stringFromArray(String[] str) {
        return StringUtils.join(str);
    }

}
