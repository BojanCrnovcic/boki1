package NIZOVI;

import java.util.Scanner;

public class StrictlyIdenticalArrays7_26 {
    public static void main(String[] args) {
        int [] listaJedan = PomocnaKlasa.unesiNiz(5);
        int [] listaDva = PomocnaKlasa.unesiNiz(5);

        if (equals(listaJedan,listaDva)){
            System.out.println("Dve liste su striktno indenticne. ");
        }else System.out.println("Dve liste nisu striktno indenticne. ");
    }


    public static boolean equals(int[] list1, int[] list2){
       if (list1.length != list2.length)
        return false;
       for (int i = 0; i < list1.length;i++){
           if (list1[i]!=list2[i])
               return false;
       }
return true;
    }
}
