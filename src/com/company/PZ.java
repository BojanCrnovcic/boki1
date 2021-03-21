package com.company;

import NIZOVI.PomocnaKlasa;
import NIZOVI.ZadatakNajmanjiElementUNizu;

import java.util.Arrays;
import java.util.Scanner;

public class PZ {
    public static void main(String[] args) {
        int [] lista = PomocnaKlasa.unesiNiz(6);

        if (isSorted(lista)){
            System.out.println("Lista je sortirana.");
        }else System.out.println("Lista nije sortirana. ");
    }



    public static boolean isSorted(int[] list){
        for (int i = 0; i<list.length; i++){
            Arrays.sort(list);
            return true;
        }
        return false;
    }
}










