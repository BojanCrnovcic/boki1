package com.company;

import java.util.Scanner;

public class SabiranjePetlja {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int broj1 = (int)(Math.random()*10);
        int broj2 = (int)(Math.random()*10);

        System.out.println("Koliko je "+broj1+ " + "+broj2+" ?");
        int odgovor = unos.nextInt();
        if (odgovor==broj1+broj2){
            System.out.println(odgovor+" Bravo vas odgovor je tacan");
        }else System.out.println(odgovor+" To nije tacan odgovor. Pokusajte ponovo");

        do {

            System.out.println("Koliko je "+broj1+ " + "+broj2+" ?" );
            odgovor = unos.nextInt();
            System.out.println(+odgovor+" To nije tacan odgovor. Pokusajte ponovo");

        }while (odgovor!=broj1+broj2);

        System.out.println(odgovor+ " Bravo vas odgovor je tacan");

    }

}
