package Petlje;


import java.util.Scanner;

public class PetljaStednja100 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite iznos stednje:");
        double stednja = unos.nextDouble();

        System.out.println("Unesite iznos kamate:");
        double kamata = unos.nextDouble();
        kamata=kamata/100;

        System.out.println("Unesite mjesec stednje:");
        int mjesec = unos.nextInt();
        double brojac = 0;
        for (int i = 1; i<= mjesec; i++){

            brojac = (stednja+brojac)*(1+(kamata/12));



        };System.out.println("Stednja nakon "+mjesec+ " mjeseci iznosi "+brojac);

    }
}
