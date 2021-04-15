package OBJEKTI;

public class KrugTest {
    public static void main(String[] args) {

        Krug krug1 = new Krug(2.0);
        System.out.println("Povrsina kruga poluprecnika "+krug1.poluprecnik+" je "+krug1.vratiPovrsinu());

        Krug krug2 = new Krug(42.0);
        System.out.println("Povrsina kruga poluprecnika "+krug2.poluprecnik+" je "+krug2.vratiPovrsinu());

        Krug krug3 = new Krug(124.0);
        System.out.println("Povrsina kruga poluprecnika "+krug3.poluprecnik+" je "+krug3.vratiPovrsinu());

        krug1.postaviPoluprecnik(7);
        System.out.println("Povrsina kruga poluprecnika "+krug1.poluprecnik+" je "+krug1.vratiPovrsinu());



    }
}
