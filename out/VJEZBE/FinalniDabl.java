package com.company;

import java.util.Scanner;

public class FinalniDabl {
    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner unos = new Scanner(System.in);
        System.out.println("Izracunaj povrsinu kruga:");
        double poluprecink = unos.nextDouble();
        double povrsina = poluprecink * poluprecink * PI;
        System.out.println("Povrsina kruga je " + poluprecink + " je " + povrsina);
    }
}
