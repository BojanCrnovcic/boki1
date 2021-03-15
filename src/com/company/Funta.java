package com.company;

import java.util.Scanner;

public class Funta {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite vrijednost u funtama:");
        double funta = unos.nextDouble();
        double kursfunte = 2.20;
        double rezultat = 0;
         if (funta < 0) {
            System.out.println("Unjelki ste negativnu vrjednost");
        }
        else {
            rezultat = funta * kursfunte;
            System.out.println("Vrijednost " + rezultat + " BAM");
        }
    }
}
