package com.company;

import java.util.Scanner;

public class ZZ {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Koliko mjesec ima dana u godini:");

        System.out.println("Unesite mjesec:");
        int mjesec = unos.nextInt();

        System.out.println("Unesite godinu:");
        int godina = unos.nextInt();

        int days = 0;
        switch (mjesec) {
            case 1:
                days = 31;
                break;
            case 2:
                if ((godina % 4 == 0 && godina % 100 != 0) || (godina % 400 == 0)) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            case 3:
                days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;
        }
        System.out.println("Mijesec u biranoj godini ima: " + days + " dan");
    }
}
