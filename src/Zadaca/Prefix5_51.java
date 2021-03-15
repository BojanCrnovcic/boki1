package Zadaca;

import java.util.Scanner;

public class Prefix5_51 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite prvu poruku:");
        String prviString = unos.nextLine();
        final int prviS = prviString.length();

        System.out.println("Unesite drugu poruku:");
        String drugiString = unos.nextLine();
        final int drugiS= drugiString.length();

        if (prviString.charAt(0) != drugiString.charAt(0)){
            System.out.println("Poruke nemaju prefix");
        }
        else
            System.out.println("Prefix je :"+prviString);


    }
}
