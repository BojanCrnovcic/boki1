package Zadaca;

import java.util.Scanner;

public class Unikod4_09 {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);

        System.out.println("Unesite simbol:");
        String s = unos.next("[A-Za-z\\d]");;
        char mojSibol = s.charAt(0);
        System.out.println("Unikod od sibola "+mojSibol+ " je broj "+(int)mojSibol);
    }
}
