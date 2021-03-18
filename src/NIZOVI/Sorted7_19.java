package NIZOVI;

import java.util.Arrays;

public class Sorted7_19 {
    public static void main(String[] args) {
        int [] lista = PomocnaKlasa.unesiNiz(6);

        if (isSorted(lista)){
            System.out.println("Lista je sortirana! ");
        }else System.out.println("Lista nije sortirana. ");
    }


    public static boolean isSorted(int[] list){
        boolean sorted = true;
        for (int i = 1; i < list.length; i++) {
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    sorted = false;
                    break;
                }

            }
        }
        return sorted;
    }
}
