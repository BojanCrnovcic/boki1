package com.company;

import java.util.Scanner;

public class Pogoditi {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int korisnik;
        System.out.println("Unesite broj:");
        int broj = (int) (Math.random() * 10);  //4
        System.out.println("broj = " + broj);
        do {
            korisnik = unos.nextInt(); //45

            if (korisnik < broj) {
                System.out.println(" Zao mi je Vas broj je manji. Pokusajte ponovo.");
                System.out.println(" Unesite ponovo broj");
            }
            if (korisnik > broj) {
                System.out.println(" Zao mi je vas broj je veci. Pokusajte ponov.");
                System.out.println("Unesite ponovo broj ");
            }

        }
        while (korisnik != broj);
        System.out.println("To je pravi broj!");
    }
}
