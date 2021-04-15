package OBJEKTI;

public class PisacTest {
    public static void main(String[] args) {

        Pisac autor = new Pisac("Pero Peric",1865);

        System.out.println("Autor: "+autor.getIme()+" , "+autor.getGodiste());

        Pisac autor1 = new Pisac("Djuro Djuric",1777);

        System.out.println("Autor: "+autor1.getIme()+" , "+autor1.getGodiste());


    }
}
