package com.company;

import java.util.Scanner;

public class Metar {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Duzina stopa u metarima:");
            double stope = unos.nextDouble();
            double metar = (stope * 0.305);
            System.out.println("Broj " + stope + " iznosi " + metar + " metara");
    } 
}
