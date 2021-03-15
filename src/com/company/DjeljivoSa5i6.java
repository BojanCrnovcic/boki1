package com.company;

import java.util.Scanner;
public class DjeljivoSa5i6 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Upisite broj i provjerite da li djeljiv sa 5 ili 6:");
        int broj = unos.nextInt();
        if (broj /5 == broj % 2 && broj /6 == broj % 2);{
            System.out.println(broj+ " Broj je djeljiv i sa 5 i sa 6.");
        }
        if (broj / 5 == broj % 2 || broj / 6 == broj % 2);{
            System.out.println(broj+ " Broj je dijeljiv ili sa 5 ili sa 6");
        }
        if (broj / 5 == broj % 2 ^ broj / 6 == broj % 22);{
            System.out.println(broj+ " Broj je dijeljiv ili sa 5 ili 6 ali ne sa oba broja");
        }
    }
}
