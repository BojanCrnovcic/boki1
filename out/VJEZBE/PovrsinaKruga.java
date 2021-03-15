package com.company;

import java.util.Scanner;

public class PovrsinaKruga {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("unesite povrinu kruga:");
        double poluprecnik = unos.nextDouble();
        double povrsina = poluprecnik * poluprecnik * 3.14;
        System.out.println("povrsina" + poluprecnik + "iznosi" + povrsina);

    }
}
