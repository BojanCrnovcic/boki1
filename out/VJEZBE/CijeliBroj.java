package com.company;

import java.util.Scanner;

public class CijeliBroj {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Saberite cifre:");
        int unosOdStraneKorisnika = unos.nextInt();
        int prvaCifra =  unosOdStraneKorisnika/ 100;
        int drugaCifra =  unosOdStraneKorisnika / 10 % 10;
        int trecaCifra =  unosOdStraneKorisnika % 10;
        int zbir = prvaCifra + drugaCifra + trecaCifra;

        System.out.println(zbir);

    }
}
