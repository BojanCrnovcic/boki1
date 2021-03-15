package com.company;

import java.util.Scanner;

public class Prosjek {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("izracunajte prosjek tri broja:");
        double broj1 = unos.nextDouble();
        double broj2 = unos.nextDouble();
        double broj3 = unos.nextDouble();
        double prosjek = broj1 + broj2 + broj3 / 3;
        System.out.println("prosjek" + broj1 + broj2 + broj3 + "prosjek");
    }
}
