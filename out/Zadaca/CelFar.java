package com.company;

import java.util.Scanner;

public class CelFar {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite stepene celzijusa:");
        int c = unos.nextInt();
        int f = 9*c/5 + 32;
        System.out.println("broj celzijusa" + c + " iznosi " + f + " u farhajtima" );
    }
}
