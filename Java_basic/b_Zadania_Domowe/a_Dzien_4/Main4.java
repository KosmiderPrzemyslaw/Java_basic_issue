package b_Zadania_Domowe.a_Dzien_4;


import a_Zadania.d_Dzien_4.a_Wprowadzanie_danych.util.ScannerUtils;

import java.util.Arrays;
import java.util.Random;

public class Main4 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sortedArray()));

    }
    static int[] sortedArray() {
        int a = ScannerUtils.getInt("Ile liczb wylosować: ");
        Random random = new Random();
        int[] tab = new int[a];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = random.nextInt(101);
            tab[i] += tab[i];
        } Arrays.sort(tab);
        return tab;
    }
}
