package com.company;

import java.util.Scanner;

public class Ternarnamalavjezba {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Odredite da li je broj paran ili ne:");
        int broj = unos.nextInt();

        System.out.println((broj % 2 == 0)?"broj je paran ":"broj je neparan") ;
    }
}
