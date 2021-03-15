package Metode;

public class BrojUPorastu6_5 {
    public static void main(String[] args) {
        SortedNumbers(7,6,5);
    }

    public static void SortedNumbers(double broj1, double broj2, double broj3){
        double temp;
        if (broj1 > broj2) {
            temp = broj2;
            broj2 = broj1;
            broj1 = temp;
        } else if (broj2 > broj3) {
            temp = broj3;
            broj3 = broj2;
            broj2 = temp;

        }
        System.out.println(broj1 + " " +broj2 + " " + broj3);
        }
    }

