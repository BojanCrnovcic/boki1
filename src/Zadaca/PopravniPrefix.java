package Zadaca;

import java.util.Scanner;

public class PopravniPrefix {
    public static void main(String[] args) {
        Scanner unos = new Scanner(System.in);
        System.out.println("Unesite prvu poruku:");
        String prvi = unos.nextLine();

        System.out.println("Unesite drugu poruku:");
        String drugi = unos.nextLine();

       int prviS = prvi.length(), drugiS =drugi.length();

        final int razlika= Math.min(prviS,drugiS);

        for (int i = 0; i < razlika; i++){
            if (razlika==prviS){
                System.out.println("Prefix je "+razlika);
            }else System.out.println("Nije prefix.");
        }
    }
}
