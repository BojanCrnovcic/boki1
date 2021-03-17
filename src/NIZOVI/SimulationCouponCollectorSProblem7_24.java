package NIZOVI;

public class SimulationCouponCollectorSProblem7_24 {
    public static void main(String[] args) {
        int brojPonavljanja = 0;
        int [] izvlacenjeKarte = new int[52];
        int karte = biranjeKarte(izvlacenjeKarte);
        int []znak = new int[4];
        while (znak[0] !=1 || znak[1] !=1 || znak[2]!=1 || znak[3] != 1)
        slikaKarte(karte);
        brojPonavljanja++;

        if (karte >= 1 && karte <= 13) {
            znak[0] = 1;
        } else if (karte >= 14 && karte <= 26) {
            znak[1] = 1;
        } else if (karte >= 27 && karte <= 39) {
            znak[2] = 1;
        } else if (karte >= 40) {
            znak[3] = 1;
        }

        System.out.print(" "+brojPonavljanja);


            }






    public static int biranjeKarte (int[] deck){
        return deck[(int) Math.random()*52];
    }
    public static void slikaKarte (int karta){
        String znak = "";
        if (karta >=1 && karta<=13){
            znak+=" PIK ";
        }
        else if (karta >= 14 && karta<=26){
            znak+=" SRCE ";
        }
        else if (karta>=27 && karta<=39){
            znak+=" TREF ";
        }else if (karta>=40){
            znak+=" KARO ";
        }
        String zamjena ="";
        switch (karta){
            case 1:{
                zamjena+=" AS ";
            }break;
            case 11:{
                zamjena+= "ZANDRAR";
            }break;
            case 12:{
                zamjena+=" DAMA ";
            }break;
            case 13:{
                zamjena+=" KRALj ";
            }break;
            default:
                zamjena = karta+" u ";

        }
        System.out.println(zamjena+znak);
    }
}
