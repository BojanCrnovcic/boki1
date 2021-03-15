package com.company;

import java.util.Scanner;

public class PovrsinaZapremina {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite poluprecnik i duzinu:");
        double poluprecnik = unos.nextDouble();
        double duzina = unos.nextDouble();

        double povrsina = poluprecnik * poluprecnik * PI;
        double zapremina = povrsina * duzina;
        System.out.println("Povrsina "+ poluprecnik + " iznosi " + povrsina);
        System.out.println("Zapremina " + duzina + " iznosi " + zapremina);
    }
}
