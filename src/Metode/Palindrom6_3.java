package Metode;

import java.util.Scanner;

public class Palindrom6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite broj:");
        int broj = scanner.nextInt();

        if (jePalindrom(broj)){
            System.out.println("Broj je palindrom.");
        }else System.out.println("Broj nije palidnrom. ");
    }

    public static int vracanje(int broj){
        String temp = "";
        while (broj> 0) {
            int t = broj % 10;
            broj /= 10;
            temp += t;
        }
        return Integer.parseInt(temp);
    }public static boolean jePalindrom(int broj){
        String s1 = String.valueOf(broj);
        String s2 = String.valueOf(vracanje(broj));
        return s1.equals(s2);
}
}
