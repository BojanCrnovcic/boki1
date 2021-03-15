package NIZOVI;

import java.util.Scanner;

public class FindTheSmallestElement7_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double [] minNumber = new double[10];
        System.out.println("Unesite elemente u nizu: ");
        for (int i = 0; i<minNumber.length;i++){
            minNumber[i]=input.nextDouble();
        }
        System.out.println("Najmanji broj niza je: "+FindTheSmallestElement7_9.min(minNumber));
    }

    public static double min(double[] array){
        double minimalni = 0;
        for (int i = 0; i<array.length;i++){
            minimalni = Math.min(minimalni,array[i]);
            }return minimalni;
        }
    }

