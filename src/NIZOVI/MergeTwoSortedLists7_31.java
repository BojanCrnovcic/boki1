package NIZOVI;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoSortedLists7_31 {
    public static void main(String[] args) {
        int [] listaJedan = PomocnaKlasa.unesiNiz(6);
        int [] listaDva = PomocnaKlasa.unesiNiz(5);

        System.out.println("The marge list is "+merge(listaJedan,listaDva));
    }





    public static int[] merge(int[] list1, int[] list2){
        int niz = list1.length+list2.length;
        int startL2 = list1.length;
         int [] rezultat = new int[niz];
        System.arraycopy(list1, 0, rezultat, 0, list1.length);
        System.arraycopy(list2, 0, rezultat, startL2, list2.length);
        Arrays.sort(rezultat);
        return rezultat;
    }
}
