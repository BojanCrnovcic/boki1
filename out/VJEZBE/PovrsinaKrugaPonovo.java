package com.company;

import java.util.Scanner;

public class PovrsinaKrugaPonovo {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("unesite poluprecnik kruga:");
        double poluprecnik = unos.nextDouble();
        double povrsina = poluprecnik * poluprecnik * 3.14159;
        System.out.println("povrsina kruga " + poluprecnik + "iznosi" + povrsina);
    }
}
