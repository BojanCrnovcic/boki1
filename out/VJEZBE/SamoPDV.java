package com.company;

import java.util.Scanner;

public class SamoPDV {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Izracunajte porast PDVa:");
        double iznos = unos.nextDouble();
        double porast = iznos * 1.17;
        System.out.println("porast PDVa " + iznos + porast);

    }
}
