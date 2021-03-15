package Zadaca;

import java.util.Scanner;

public class MajorIStatus4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite status ucenika");

        String unos = scanner.next();

        char major = unos.charAt(0), status = unos.charAt(1);

        String predmet ="",  ocjene="";

        switch (major) {
            case 'M': {
                predmet = "Mathematics";
            }break;
            case 'C': {
                predmet = "Computer Science";
            }break;
            case 'I': {
                predmet = " Information Technology";
            }break;
        }
        switch (status){
            case '1': {
                ocjene = "Freshman";
            }break;
            case '2': {
                ocjene = "Sophomore";
            }break;
            case '3': {
                ocjene = "Junior";
            }break;
            case '4': {
                ocjene = "Senior";
            }break;
        }

        System.out.println(predmet+" "+ocjene);

        if (unos != predmet || unos != ocjene){
            System.out.println("Invalidan unos");
        }

    }
}
