package com.company;

import java.util.Random;
import java.util.Scanner;

public class IgraKPM {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        Random random = new Random();

        final int kamen = 1;
        final int papir = 2;
        final int makaze = 3;

        System.out.println("Unesite: Kamen (1), Papir (2), Makaze (3)...");
        int igrac = unos.nextInt();
        if (igrac == 1 ||igrac == 2||igrac == 3);

            int komp = random.nextInt(3);
            String rezultat = "Kopmjuter je ";
            switch (igrac) {
                case 1: {
                    if (komp == kamen) rezultat += " igrao kamen. Rezultat je nerijesen...";
                    else if (komp == papir) rezultat += " igrao papir. Kompjuter odnosi pobjedu!";
                    else if (komp == makaze) rezultat += " igrao makaze. Vi ste pobjednik!!!";
                }
                break;
                case 2: {
                    if (komp == kamen) rezultat += " igrao kamen. Vi ste pobjednik!!!";
                    else if (komp == papir) rezultat += " igrao papir. Rezultat je nerijesen...";
                    else if (komp == makaze) rezultat += " igrao makaze. Kompjuter odnosi pobjedu!";
                }
                break;
                case 3: {
                    if (komp == kamen) rezultat += " igrao kamen. Kompjuter odnosi pobjedu!";
                    else if (komp == papir) rezultat += " igrao papir. Vi ste pobjednik!!!";
                    else if (komp == makaze) rezultat += " igrao makaze. Rezultat je nerijesen...";
                }
                break;

            }
            System.out.println(rezultat);



    }

}
