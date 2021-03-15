package Zadaca;

import java.util.Scanner;

public class Samoglasnici5_49 {
    public static void main(String[] args) {
        final String stringsamoglasnici = "aeiou";
        Scanner unos = new Scanner(System.in);
        System.out.println("Koliko vasa recenica ima samoglasnika i suglasnika?");

        String poruka = unos.nextLine();

        int samoglasnik = 0, suglasnik = 0;

        for (int i = 0; i < poruka.length(); i++) {
            char ch = poruka.charAt(i);
            if (Character.isLetter(ch)) {
                if (stringsamoglasnici.contains(String.valueOf(ch))) {
                    samoglasnik++;
                } else {
                    suglasnik++;
                }
            }
        } System.out.println("Vasa recenica ima " + samoglasnik + " samoglasnika i " + suglasnik + " suglasnika.");
    }
}