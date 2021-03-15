package com.company;

import java.util.Scanner;

public class Modulo {
    public static void main(String[] args) {
        //pitanje korisniku
        System.out.println("pitanje....");
        //unos od strane korsnika
        Scanner unos = new Scanner(System.in);
        double sekunde = unos.nextDouble();
        //formula
        double minuta=sekunde / 60;
        double sek = sekunde % 60;
        //ispis
        System.out.println("sek"+sek);
    }
}
