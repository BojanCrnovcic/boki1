package com.company;

import java.util.Scanner;

public class CijeliBrojevi {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("unesite cijele brojeve:");

        int korsinik = 8;
        int zbir = 0;
        double prosjek =0;
        int brojac = 0;

        while (korsinik != 0){
            int korisnik = unos.nextInt();
            zbir += korisnik;
            System.out.println(" zbir je " +zbir);
            prosjek = zbir/korisnik;
            System.out.println("prosjek je" + +prosjek);





                }

        }
    }
