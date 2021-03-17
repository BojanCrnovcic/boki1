package NIZOVI;

import java.util.Scanner;

public class PatternRecognitionConsecutiveFourEqualNumbers7_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Unesite broj vrijednosti");
        int niz = input.nextInt();

        int [] vrijednost = new int[niz];
        System.out.println("Unesite vrijednosti");
        for (int i = 0; i<vrijednost.length;i++){
            vrijednost[i]=input.nextInt();
        }
        if (isConsecutiveFour(vrijednost)){
            System.out.println("Lista ima cetiri vezana broja. ");
        }else System.out.println("Lista nema cetiri vezana broja. ");
    }



    public static boolean isConsecutiveFour(int[] values){
        int broj = values[0];
        int count = 1;

        for (int i = 0; i < values.length;i++){
            if (broj==values[i]){
                count++;
            }else { broj=values[i];
            count =1;}

            if (count==4){
                return true;
            }

        }return false;
    }

}
