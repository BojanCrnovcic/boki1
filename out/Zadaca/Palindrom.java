package com.company;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite tri broj i provjerite da li je palindrom:");

        int tribroja = unos.nextInt();
        int zadnjiBroj = tribroja % 10;
        int prednjiBroj = tribroja / 100;


        if (prednjiBroj == zadnjiBroj){
            System.out.println(tribroja+ "Broj je Palinrom");
        }
        else {
            System.out.println(tribroja + "Broj nije palindrom");
        }



    }
}
