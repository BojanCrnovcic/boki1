package com.company;

import java.util.Scanner;

public class Prsojek3broja {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Izracunaj prosjek 3 broja: ");
        int broj1 = unos.nextInt();
        int broj2 = unos.nextInt();
        int broj3 = unos.nextInt();
        int prosjek = (broj1 + broj2 + broj3) /3;
        System.out.println("Prosjek 3 broja je " + prosjek);
    }
}
