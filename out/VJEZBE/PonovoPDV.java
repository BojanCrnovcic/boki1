package com.company;

import java.util.Scanner;

public class PonovoPDV {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("izracunajte porast PDVa:");
        double porast = unos.nextDouble();
        double iznos = porast * 1.17;
        System.out.println("porast od" + porast + "iznosi" + iznos);

    }
}
