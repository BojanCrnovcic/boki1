package NIZOVI;

import java.util.Scanner;

public class PozivZaDveMetodeZadatak {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int[]integer = new int[10];
            double[]doubles = new double[10];
            System.out.println("Unesite 10 brojeva da dobijete njihov prosjek:");
            for (int i = 0; i<10;i++){
                doubles[i]= input.nextDouble();
                integer[i]= (int) doubles[i];
            }
            int avarageInt = ZadatakDveMetode.avarage(integer);
            double avarageDouble = ZadatakDveMetode.avarage(doubles);
            System.out.println("Prosjek za int je: "+ZadatakDveMetode.avarage(integer)+" a double prosjek je: "+ZadatakDveMetode.avarage(doubles));

        }
    }

