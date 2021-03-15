package com.company;

import java.util.Scanner;

public class TrazimoF {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        int x = unos.nextInt(); ;
        int y  = unos.nextInt();
        int z = unos.nextInt();
        double f = unos.nextDouble();
     f = (x + y / 2 * x - y * (x+z) * Math.sin(x));
       System.out.println("broj " + f + " je" + f);
    }
}
