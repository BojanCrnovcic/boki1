package com.company;

import java.util.Scanner;

public class Celzijus {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Temperatura u fahrenheitima:");
        double celsius = unos.nextDouble();
        double fahrenheit = (9.0/5) * celsius + 32;
        System.out.println("Temperatura od " + celsius + " iznosi " + fahrenheit + " fahrenheita ");
    }
}
