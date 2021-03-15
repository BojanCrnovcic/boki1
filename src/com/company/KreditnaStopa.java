package com.company;

import java.util.Scanner;

public class KreditnaStopa {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        double mijesecnaKamata;
        double mijesecnaUplata;
        double ukupnaUplata;
        System.out.println("Unesite iznos pozajmice:");
        double pozajmica = unos.nextDouble();
        System.out.println("Unesite broj godina:");
        double godine = unos.nextDouble();

        System.out.println("Kamatna stopa --- mijesecna uplata --- Ukupna uplata");
        for (double i=5.0;i<=8.0;i += 0.125){
             mijesecnaKamata = i/1200;
             godine = mijesecnaKamata*12;
             mijesecnaUplata = pozajmica*mijesecnaKamata;
             ukupnaUplata = pozajmica*mijesecnaUplata*godine*12;

            System.out.println(i+"%"+"       "+mijesecnaUplata+"        "+ukupnaUplata);

        }
    }
}
