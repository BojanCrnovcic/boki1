package String;

import java.util.Scanner;

public class ZadatakVRacanje {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String poruka = scanner.nextLine();

        int brojacVelikihSlova =0;
        int brojacMalihSLova =0;

        for (int i = 0; i<poruka.length();i++){
            if (Character.isUpperCase(poruka.charAt(i))){
                brojacVelikihSlova++;
            }
        }
    }
}