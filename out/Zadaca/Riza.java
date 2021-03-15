package com.company;

import java.util.Scanner;

public class Riza {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite tezinu prvog pakovanja: ");
        double prvoPakovanjeTezina = unos.nextDouble();
        System.out.println("Unesite cijenu prvog pakovanja: ");
        double prvoPakovanjeCijena = unos.nextDouble();

        System.out.println("Unesite tezinu drugog pakovanja: ");
        double drugoPakovanjeTezina = unos.nextDouble();
        System.out.println("Unesite cijenu drugog pakovanja: ");
        double drugoPakovanjeCijena = unos.nextDouble();

        double prvipaket = prvoPakovanjeCijena / prvoPakovanjeTezina;
        System.out.println("Cijena prvog paketa: " + prvipaket);

        double drugipaket = drugoPakovanjeCijena / drugoPakovanjeTezina;
        System.out.println("Cijena drugi paketa: " + drugipaket);

        if (prvipaket < drugipaket || drugipaket > prvipaket ){
            System.out.println("Prvi paket je povoljniji " +prvipaket);
        }
        else System.out.println("Drugi paket je povoljniji "+ drugipaket);

    }
}
