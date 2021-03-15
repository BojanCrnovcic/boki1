package Zadaca;

import java.util.Scanner;

public class SamoglasniciSUglasnici4_13 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite slovo: ");
        String slovo = unos.next().trim();

        if (slovo.length() > 1) {
            System.out.println(slovo + " je pogresan sibmol.");
        } else {
            char ch = slovo.charAt(0);
            if (Character.isLetter(ch)) {
                String s = ch + "";
                String rezultat = "";
                if ("aeiou".contains(slovo.toLowerCase())) {
                    rezultat = "samoglasnik";
                } else {
                    rezultat = "suglasnik";
                }
                System.out.println(ch + " je " + rezultat);

            } else {System.out.println(ch + " je pogresan sibmol.");
            }

        }

    }
}
