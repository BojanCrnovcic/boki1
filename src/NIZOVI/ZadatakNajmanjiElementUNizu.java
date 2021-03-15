package NIZOVI;

import java.util.Scanner;

public class ZadatakNajmanjiElementUNizu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] minElement = new int[10];
        System.out.println("Unesite elemente u niz:");
        for (int i = 0; i<minElement.length;i++){
            minElement[i]= input.nextInt();
        }
        System.out.println("Index najmanjeg elementa u nizu je: "+indexOfSmallestElement(minElement));
    }


    public static int indexOfSmallestElement(int[]array){
        int index = 0;
        int min = array[index];
        for (int i = 1; i<array.length;i++){
            if (min>array[i]){
                array[i]=min;
                index=i;
            }
        }return index;
    }
}
