package b_Zadania_Domowe.a_Dzien_4;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {

    private static final int MALE_RETIREMENT_AGE = 65;
    private static final int FEMALE_RETIREMENT_AGE = 60;
    private static final String MALE = "M";
    private static final int SURNAME = 0;
    private static final int FIRSTNAME = 1;
    private static final int YEAR_OF_BIRTH = 2;
    private static final int GENDER = 3;

    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(retirement()));
        } catch (IOException e) {
            System.out.println("File read error");
            e.printStackTrace();
        }

    }

    public static String[] retirement() throws IOException {
        Path file = Paths.get(ScannerUtils.getStringSec("Podaj nazwę pliku: "));

        if (!Files.exists(file)) {
            System.out.println("File doesn't exist!");
        }
        List<String> list = new ArrayList<>(Files.readAllLines(file));
        for (int i = list.size() - 1; i >= 0; i--) {
            String[] item = list.get(i).split(" ");
            if (isInAgeRetirement(item[YEAR_OF_BIRTH], item[GENDER])) {
                list.remove(i);
            } else list.set(i, String.join(" ", item[FIRSTNAME], item[SURNAME]));
        }
        return list.toArray(new String[0]);
    }

    private static boolean isInAgeRetirement(String yearOfBirth, String gender) {
        if (isMale(gender)) {
            return LocalDate.now().minusYears(Long.parseLong(yearOfBirth)).getYear() < MALE_RETIREMENT_AGE;
        }
        return LocalDate.now().minusYears(Long.parseLong(yearOfBirth)).getYear() < FEMALE_RETIREMENT_AGE;
    }

    private static boolean isMale(String gender) {
        return gender.equalsIgnoreCase(MALE);
    }

}
