package Metode;

public class MetodeDanUGodini {
    public static void main(String[] args) {

        int godina = brojDanaUGodini(2000);

        System.out.println("Dan "+godina);


    }

    public static int brojDanaUGodini(int godina) {

        if (godina % 4 == 0 || godina % 400 == 0 && godina % 100 != 0) {
return 366;
        }else return 365;
    }
}


