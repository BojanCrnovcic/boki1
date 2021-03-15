package Metode;

public class VracanjeS {
    public static void main(String[] args) {

       int sabiranjeInt = sabiranje(4,7);
       double sabiranjeDouble = sabiranje(3.5677,4.6540);

        System.out.println("Rezultat int sabiranja: "+sabiranjeInt);
        System.out.println("Rezultat double sabiranja: "+sabiranjeDouble);

    }    public static int sabiranje(int prviBr, int drugiBr){
        return prviBr+drugiBr;
    }
    public static double sabiranje(double prviBr, double drugiBr){
        return prviBr+drugiBr;
    }
}
