package com.company;

import java.util.Scanner;

public class KamatnaStopa {
    public static void main(String[] args) {
        final double MJESECNA_KAMATNA_STOPA = 0.00417;
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite mjesecnu setdnju:");
        double mjesecnaUsteda = unos.nextDouble();
        double mjesec2 = 100 * (1 + MJESECNA_KAMATNA_STOPA);
        double mjesec3 = 100 * (1 + MJESECNA_KAMATNA_STOPA);
        double mjesec4 = 100 * (1 + MJESECNA_KAMATNA_STOPA);
        double mjesec5 = 100 * (1 + MJESECNA_KAMATNA_STOPA);
        double mjesec6 = 100 * (1 + MJESECNA_KAMATNA_STOPA);

        double kamata  = mjesec2 + mjesec3 + mjesec4 + mjesec5 + mjesec6 + MJESECNA_KAMATNA_STOPA;
        double konacno = mjesecnaUsteda + kamata;

        System.out.println("Kamata od " + konacno );
    }
}
