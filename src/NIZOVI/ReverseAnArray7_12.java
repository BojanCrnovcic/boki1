package NIZOVI;

import java.util.Arrays;

public class ReverseAnArray7_12 {
    public static void main(String[] args) {
        int []niz = PomocnaKlasa.unesiNiz(10);

        System.out.println("Obrnuti niz je :"+reverseNumbers(niz));

    }



    public static int [] reverseNumbers (int [] numbers){
        int j = numbers.length - 1;
        for (int i = 0; i < numbers.length / 2; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = tmp;
            j--;
        }
        return numbers;

        }
    }
