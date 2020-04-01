package a_Zadania.d_Dzien_4.d_External_jar;

import org.apache.commons.lang3.StringUtils;

public class Main4 {

    public static void main(String[] args) {
        String str = "kajak ";
        str = StringUtils.deleteWhitespace(str);
        String str2 = StringUtils.reverse(str);
        if (str.equals(str2)) {
            System.out.println("palindrom");
        } else {
            System.out.println("Nie palindrom");
        }
    }
}
