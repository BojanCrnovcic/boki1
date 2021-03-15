package com.company;

import java.util.Scanner;

public class RendomOduzimanje {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Navedite dva nesumicna broja:");
        int prviBroj = (int)(Math.random()*10);
        int drugiBroj = (int)(Math.random()*10);

        Math.max(prviBroj,drugiBroj);

        System.out.println("Koliko je "+prviBroj+" - "+drugiBroj);
        int odgovor = unos.nextInt();
        int rezultat1 = prviBroj - drugiBroj;

        System.out.println("Rezultat je " + odgovor );

        if (odgovor == rezultat1) {
            System.out.println("Bravo to je tacan odgovor!");
        }else System.out.println("Rezultat "+rezultat1+ " se ne moze uvaziti");
    }
}

