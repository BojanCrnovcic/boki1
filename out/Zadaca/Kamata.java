package com.company;

import java.util.Scanner;

public class Kamata {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Izracunajte kamatnu stopu:");
        double mjesecniIznos = unos.nextDouble();
        double mjesecnaKamata = 0.5/12;
        double porastMjesecneKamate = 100 * (1 + mjesecnaKamata);
        int MJESEC = 6;
        double konacnaKamata = mjesecniIznos + 6 * porastMjesecneKamate;
        System.out.println(konacnaKamata);
    }
}
