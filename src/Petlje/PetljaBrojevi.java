package Petlje;

import java.util.Scanner;

public class PetljaBrojevi {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        double total =0;
        int brojac =0;
        int brojacPozitivnih =0;
        int brojacNegativnih =0;
        double brojacPresjek =0;
        System.out.println("Unesite brojeve a da nije nula:");
        int broj = unos.nextInt();
        if (broj==0){
            System.out.println("Zao mi je unijeli ste nulu.");
        };
        while (broj!=0){
            broj = unos.nextInt();
            total+=broj;
            brojac++;
            if (broj<0) {
                brojacNegativnih++;
            }
            if (broj>0) {
            brojacPozitivnih++;
            }

        } brojacPresjek = total/brojac;

        System.out.println("Broj pozitivnih brojeva je :"+brojacPozitivnih);
        System.out.println("Broj negativnih brojeva je :"+brojacNegativnih);
        System.out.println("Total: "+brojac);
        System.out.println("Presjek: "+brojacPresjek);

    }
}
