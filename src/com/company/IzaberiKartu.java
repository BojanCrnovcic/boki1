package com.company;

public class IzaberiKartu {
    public static void main(String[] args) {
        System.out.println("Izvucite kartu: ");

        String kartaIDE = "";
        int karta = (int)(Math.random()*13)+1;
        switch (karta){
            case 1: kartaIDE += "AS";
                break;
            case 2: kartaIDE += "2";
                break;
            case 3: kartaIDE += "3";
                break;
            case 4: kartaIDE += "4";
                break;
            case 5: kartaIDE += "5";
                break;
            case 6: kartaIDE += "6";
                break;
            case 7: kartaIDE += "7";
                break;
            case 8: kartaIDE += "8";
                break;
            case 9: kartaIDE += "9";
                break;
            case 10: kartaIDE += "10";
                break;
            case 11: kartaIDE += "Jandar";
                break;
            case 12: kartaIDE += "Dama";
                break;
            case 13: kartaIDE += "Kralj";
                break;
        }

        String znakIDE = "";
        int znakKarta = +(int)(Math.random()*4)+1;
        switch (znakKarta){
            case 1: znakIDE += "PIK";
                break;
            case 2: znakIDE += "HERC";
                break;
            case 3: znakIDE += "TREF";
                break;
            case 4: znakIDE += "KARO";
                break;
        }

        System.out.println("Karta koju ste izvukli je "+ kartaIDE +" "+ znakIDE);

    }

}
