package Metode;

public class MainZaVracanjePI {
    public static void main(String[] args) {


        System.out.println("i ----------------------- m(i)");

        for (int i = 1; i<1000; i+=100){
            System.out.println(i+"                     "+VracanjePI6_14.pi(i));
        }
    }
}
