package NIZOVI;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeTwoSortedLists7_31 {
    public static void main(String[] args) {
        int [] listaJedan = PomocnaKlasa.unesiNiz(6);
        System.out.println("++++++++++++++++++++++++++++++");
        int [] listaDva = PomocnaKlasa.unesiNiz(5);

         PomocnaKlasa.ispis(merge(listaJedan,listaDva));


    }


    public static int[] merge(int[] list1, int[] list2){
        int duzinaNizova = list1.length+list2.length;

        int [] rezultat = new int[duzinaNizova];

        for (int i = 0; i<list1.length;i++){
            rezultat[i]=list1[i];
        }
        int indexZaDrugiNiz = 0;
        for (int i =list1.length; i<duzinaNizova;i++){
            rezultat[i] = list2[indexZaDrugiNiz];
            indexZaDrugiNiz++;
        }

         Arrays.sort(rezultat);
        return rezultat;
    }
}
