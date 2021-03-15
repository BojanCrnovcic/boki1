package Metode;

public class VracanjePI6_14 {

public static double pi(double broj){

    double rezultat =0;
    for (int i = 1; i<=broj;i++){
        rezultat+=Math.pow(-1,i+1)/(2*i-1);
    }


    return rezultat*4;
}
}
