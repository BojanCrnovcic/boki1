package OBJEKTI;

public class TVTest {
    public static void main(String[] args) {

        TV tv1 = new TV();

        tv1.upaliti();
        tv1.kanalGore();
        tv1.jacinaZvukaGore();
        tv1.jacinaZvukaGore();
        tv1.jacinaZvukaGore();
        tv1.jacinaZvukaDole();
        tv1.ugasiti();
        tv1.kanalGore();

        System.out.println(tv1.upaljen);
        System.out.println(tv1.kanal);
        System.out.println(tv1.jacinaZvuka);
    }
}
