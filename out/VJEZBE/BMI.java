package com.company;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite vasu tezinu u funtama:");
        double tezinaFuntama = unos.nextDouble();

        System.out.println("Unesite vasu visinu u incima:");
        double visinaInci = unos.nextDouble();

        double tezinaKilogram = tezinaFuntama * 0.45359237;
        double visinaMetar = visinaInci * 0.0254;
    }
}
