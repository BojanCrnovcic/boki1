package NIZOVI;

import java.util.Arrays;

public class IdenticalArrays7_27 {
    public static void main(String[] args) {
        int[] listaJedan = PomocnaKlasa.unesiNiz(6);
        int[] listaDva = PomocnaKlasa.unesiNiz(6);

        if (equalss(listaJedan, listaDva)) {
            System.out.println("Dve list su indeticne.");
        } else System.out.println("Dve liste nisu indeticne.");
    }


    public static boolean equalss(int[] list1, int[] list2) {
        Arrays.sort(list1);
        Arrays.sort(list2);

        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }
}
