package com.company;

import java.util.Scanner;

public class PetljaPrviDanMjeseca {
    public static void main(String[] args) {
        Scanner unos =new Scanner(System.in);
        System.out.println("Unesite godinu:");
        int godina = unos.nextInt();
        System.out.println("Unesite prvi dan u godini");
        int prviDanuGodini = unos.nextInt();
        int  prviDanUMjesecu =0;

        for (prviDanuGodini =1;prviDanuGodini<=7;prviDanuGodini++){

            int m;
            if (prviDanUMjesecu == 1) {
                m = 13;
                godina -= 1;
            } else if (prviDanUMjesecu == 2) {
                m = 14;
                godina -= 1;
            } else {
                m = prviDanUMjesecu;
            }
            int k = godina % 100;
            int j = godina / 100;
            prviDanUMjesecu = (prviDanuGodini + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

            String danUsedmici = "";

            switch (prviDanUMjesecu) {
                case 1:
                    danUsedmici += "Subota";
                    break;
                case 2:
                    danUsedmici += "Nedelja";
                    break;
                case 3:
                    danUsedmici += "Ponedeljak";
                    break;
                case 4:
                    danUsedmici += "Utorak";
                    break;

                case 5:
                    danUsedmici += "Sreda";
                    break;

                case 6:
                    danUsedmici += "Cetvrtak";
                    break;

                case 7:
                    danUsedmici += "Petak";
                    break;


        }

    }
}
}
