package NIZOVI;

public class PrintDistinctNumbers7_5 {
    public static void main(String[] args) {

        int [] niz = PomocnaKlasa.unesiNiz(10);

        int presjekNiz=0;
        int brojac=0;

        for (int i = 0; i<niz.length;i++){

            if (specijalniBroj(niz,presjekNiz)){
            niz[brojac]=presjekNiz;
            brojac++;
        }
            if (niz[i]!=0){
                System.out.print(" "+niz[i]);
            }
        }
    }
    private static boolean specijalniBroj (int []a,int number){
        for (int i = 0; i<a.length;i++){
            if (a[i]==number) return false;
        }return true;
    }
}
