package com.company;

import java.util.Scanner;

public class Gorivo {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("izracunaj");
        double distanca = unos.nextDouble();
        double potrosnja = unos.nextDouble();
        double cijenaPoLitru = unos.nextDouble();

        double cijenaVoznje = ( distanca  *  potrosnja /100 * cijenaPoLitru);
        System.out.println(cijenaVoznje);
    }
}
