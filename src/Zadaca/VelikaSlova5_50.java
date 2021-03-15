package Zadaca;

import java.util.Scanner;

public class VelikaSlova5_50 {
    public static void main(String[] args) {


        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite poruku:");

        String poruka = unos.nextLine();
        int velikoSlovo =0 ;

        for (int i = 0; i<poruka.length();i++){
            char ch = poruka.charAt(i);
            if (Character.isUpperCase(ch)){
                velikoSlovo++;
            }
        }
        System.out.println("Broj velikih slova u vasoj poruci je: "+poruka );
    }
}
