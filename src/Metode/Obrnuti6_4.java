package Metode;

public class Obrnuti6_4 {
    public static void main(String[] args) {
        obrnuti(6578);
    }


    public static void obrnuti(int broj){

        while (broj>0){
            System.out.print(broj%10);
            broj = broj/10;
        }

    }
}
