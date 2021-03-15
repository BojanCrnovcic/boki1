package Petlje;

public class NoviZadatakPetlja {
    public static void main(String[] args) {
        int  brojac =0;

        for (int broj = 100;broj<1000;broj++){
            if (broj % 5==0&&broj % 6==0){
                System.out.print(" "+ broj);
            }
            if (brojac %10 ==0){
                System.out.println();
                brojac++;
            }
        }

    }
}
