package Zadaca;

import java.util.Scanner;

public class Obrnuto5_46 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite poruku:");
        String poruka = unos.nextLine();

        for (int i = poruka.length()-1;i>=0; i--){
            System.out.print(poruka.charAt(i));
        }

    }
}
