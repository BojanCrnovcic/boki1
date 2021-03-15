package com.company;

import java.util.Scanner;

public class Prekidac {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int dan = unos.nextInt();

        switch (dan) {
            case 1: {
                System.out.println("ponedeljak");
                break;
            }
            case 2: {
                System.out.println("utorak");
                break;
            }
            case 3: {
                System.out.println("srjeda");
                break;
            }
            case 4: {
                System.out.println("cetvrtak");
                break;
            }
            case 5: {
                System.out.println("petak");
                break;
            }
            case 6: {
                System.out.println("subota");
                break;
            }
            case 7: {
                System.out.println("nedelja");
                break;
            }
        }
    }
}