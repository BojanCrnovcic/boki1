package OBJEKTI;

public class Bibiloteka {
    public static void main(String[] args) {

        Knjiga [] knjiga = new Knjiga[4];

        Knjiga knjiga1 = new Knjiga("Na Drini cuprija" , "Roman", "Ivo Andric" );
        Knjiga knjiga2 = new Knjiga("Tvrdjava" , "Roman", "Mesa Selimovic" );
        Knjiga knjiga3 = new Knjiga("LOTR" , "Epska Fnatastika", "DZ.R.R. Tolikin" );
        Knjiga knjiga4 = new Knjiga("Isijavanje" , "Horor", "Stiven King" );

        knjiga[0] = knjiga1;
        knjiga[1] = knjiga2;
        knjiga[2] = knjiga3;
        knjiga[3] = knjiga4;

        for (int i = 0; i < knjiga.length; i++){
            System.out.println(knjiga[i].getNaziv()+" , "+knjiga[i].getZanr()+" , "+knjiga[i].getPisac());
        }

    }
}
