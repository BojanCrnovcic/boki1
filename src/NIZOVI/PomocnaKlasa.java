package NIZOVI;

import java.util.Scanner;

public class PomocnaKlasa {

    public static int [] unesiNiz (int brojUnosa){
        System.out.println("Unesite "+brojUnosa+ " integera");
        Scanner input = new Scanner(System.in);
        int [] niz = new int[brojUnosa];
        for (int i = 0; i<brojUnosa;i++){
            niz [i]= input.nextInt();
        }return niz;
    }


    public static void ispis(int[] merge) {
        for (int i:merge
             ) {
            System.out.print(" "+i);

        }
    }
}


