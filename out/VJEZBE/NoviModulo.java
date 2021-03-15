package com.company;

import java.util.Scanner;

public class NoviModulo {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite broj sekudni:");
        int sekunde = unos.nextInt();
        int minute = sekunde / 60;
        int preostaleSekunde = sekunde % 60;
        System.out.println( sekunde + " sekundi je " + minute + " minuta i " + preostaleSekunde + " sekundi");
    }
}
