package com.company;

import java.util.Random;
import java.util.Scanner;

public class GlavaILIpismo {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        Random random = new Random();

        final int pismo = 0;
        final int glava = 1;

        System.out.println("Birajte pismo ili glavu: PISMO (0), GLAVA (1)...");
        int igrac = unos.nextInt();
        if (igrac == 0 || igrac == 1);

        int komp = random.nextInt(2);
        String rez = "Novcic je pao na ";
        switch (igrac){
            case 0: {
                if (komp == pismo) rez += " PISMO. Bravo! Pogodili ste!";
                else if (komp == glava) rez += " GLAVA. Promasili ste. Pokusajte ponovo.";
            }break;
            case 1: {
                if (komp == pismo) rez += " PISMO. Promasili ste. Pokusajte ponovo.";
                else if (komp == glava) rez += " GLAVA. Bravo! Pogodili ste!";
            }break;
        }
        System.out.println(rez);
    }
}
