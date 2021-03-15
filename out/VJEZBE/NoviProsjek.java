package com.company;

import java.util.Scanner;

public class NoviProsjek {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Izracunajte prosjek 3 broja:");
        double broj1 = unos.nextDouble();
        double broj2 = unos.nextDouble();
        double broj3 = unos.nextDouble();
        double prosjek = (broj1 + broj2 + broj3) / 3;
        System.out.println("prosjek tri broja " + broj1 + broj2 + broj3 + " iznosi " + prosjek);
    }
}
