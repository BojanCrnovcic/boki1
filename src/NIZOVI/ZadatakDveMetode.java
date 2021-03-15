package NIZOVI;

import java.util.Scanner;

public class ZadatakDveMetode {


    public static int avarage (int[]array){
        int suma =0;
        for (int i = 0; i<array.length;i++){
            suma+=array[i];

        } int  prosjek= suma/array.length;

        return prosjek;
    }

    public static double avarage (double[]array){
        double suma = 0;
        for (int i = 0;i<array.length;i++){
            suma+=array[i];
        }
        double prosjek = suma/array.length;
        return prosjek;

    }
}
