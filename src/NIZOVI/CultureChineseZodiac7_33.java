package NIZOVI;

import java.util.Scanner;

public class CultureChineseZodiac7_33 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String [] kineskiZodijak = {"Majmun", "Pjetao", "Pas", "Svinja", "Pacov", "Bik", "Tigar", "Zec", "Zmaj", "Zmija", "Konj", "Ovca"};

        System.out.println("Unesite godinu: ");
        int godina = input.nextInt();

        String horoskop = kineskiZodijak[godina % 12];

        System.out.println("Vas znak u kineskom horoskopu je "+horoskop);
    }

}
