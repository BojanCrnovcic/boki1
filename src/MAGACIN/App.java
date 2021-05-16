package MAGACIN;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("M - A - G - A - C - I - N");
        System.out.println("Meni :");
        System.out.println("1) Artikle. 2) Slobodni prostor. 3) Zaposleni. 4) Otpremnice. ");

        try {
            int unos = input.nextInt();

            if (unos == 1) {
                Artikl artikl = new Artikl(" Jelen Pivo. ", " Apatinska pivara. ", 1);
                System.out.println(artikl.getImeArtikla() + " Dobavlja : " + artikl.getImeDobavljaca() + " Popunjeni prstor : " + artikl.getZauzetiProstor() + "%");
                Artikl artikl1 = new Artikl("Nektar Pivo. ", " Banjalucka pivara. ", 1);
                System.out.println(artikl1.getImeArtikla() + " Dobavlja : " + artikl.getImeDobavljaca() + " Popunjeni prstor : " + artikl.getZauzetiProstor() + "%");
                Artikl artikl2 = new Artikl("Zajecarsko Pivo. ", " Zajecarska pivara. ", 1);
                System.out.println(artikl2.getImeArtikla() + " Dobavlja : " + artikl.getImeDobavljaca() + " Popunjeni prstor : " + artikl.getZauzetiProstor() + "%");
            } else if (unos == 2) {
                Magacin magacin = new Magacin();
                System.out.println(magacin.getKapacitetMagacina() + "%");
                System.out.println("Slobodni prostor: " + magacin.getZauzetiProstor());
            } else if (unos == 3) {
                Magacioner zaposleni = new Magacioner("Pero");
                System.out.println("Magacionar: " + zaposleni.getIme());
                Magacioner zaposleni2 = new Magacioner("Djuro");
                System.out.println("Magacionar: " + zaposleni2.getIme());
                Magacioner zaposleni3 = new Magacioner("Mika");
                System.out.println("Magacionar: " + zaposleni3.getIme());
                Magacioner zaposleni4 = new Magacioner("Zika");
                System.out.println("Magacionar: " + zaposleni4.getIme());
            } else if (unos == 4) {
                Otpremnica otpre = new Otpremnica(123, "Bojan. ", "Zeljo. ", 1, "Pero");
                System.out.println("ID otpremnice: " + otpre.getIdOtpremnice() + " Kupac: " + otpre.getKupac() + " Preuzeo: " + otpre.getPreuzimac() + " Oslobnjen prostor: " + otpre.getZauzetiProstor() + "% " + " Magacionar: " + otpre.getPredavac());
                Otpremnica otpre1 = new Otpremnica(432, "Nikola. ", "Zeljo. ", 3, "Pero");
                System.out.println("ID otpremnice: " + otpre1.getIdOtpremnice() + " Kupac: " + otpre1.getKupac() + " Preuzeo: " + otpre1.getPreuzimac() + " Oslobnjen prostor: " + otpre1.getZauzetiProstor() + "% " + " Magacionar: " + otpre1.getPredavac());
            } else System.out.println("Greska. Izaberite pravi broj.");

        } catch (Exception exception) {
            System.out.println("Greska. Izaberite broj");
        }
    }
}