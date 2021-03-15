package Petlje;

import java.util.Scanner;

public class Zadatak44 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        int korisnik = unos.nextInt();
        int broj =1;

        for (broj = 1; broj < korisnik; broj++){

            if (broj %13==0){
                System.out.println(" "+broj);
            }

        }
    }
}
