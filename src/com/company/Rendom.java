package com.company;

import java.util.Scanner;

public class Rendom {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);


        System.out.println("Navedite prvi nesumicni broja:");

        int prvibroj = (int) (Math.random() * 10);
        int drugibroj = (int) (Math.random() * 10);
        System.out.println(prvibroj);
        System.out.println(drugibroj);


        int rezultat = prvibroj + drugibroj;


        int unijeti;
        do {
            System.out.println("Koliko je " + prvibroj + "+" + drugibroj);
            unijeti = unos.nextInt();
        }
        while (unijeti != rezultat);

        System.out.println("Bravo, to je tacan rezultat! ");


    }
}
