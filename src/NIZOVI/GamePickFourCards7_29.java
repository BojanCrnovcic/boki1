package NIZOVI;

public class GamePickFourCards7_29 {
    public static void main(String[] args) {
        int [] spil = napraviSpil();
        int sum = 0;
        int biraj = 0;


            sum = izvuciCetiriKarte(spil);
            biraj++;
            System.out.println("Izvuceno je "+biraj+" karti za zbir "+sum);
        }



    private static int izvuciCetiriKarte (int []spil){
        int kartaJedan = spil[(int)Math.random()*51];
        int kartaDva = spil[(int)Math.random()*51];
        int kartaTri = spil[(int)Math.random()*51];
        int kartaCetiri = spil[(int)Math.random()*51];
        return (kartaJedan+kartaDva+kartaTri+kartaCetiri);
    }


    private static int [] napraviSpil(){
        int [] spil = new int[52];
        int brojKarte = 1;
        for (int i = 0; i<spil.length;i++){
            spil[i]=brojKarte;
            if (brojKarte==13){
                brojKarte=1;
                continue;
            }brojKarte++;

        }return spil;
    }
}
