package OBJEKTI;

import java.util.ArrayList;

public class GradTest {
    public static void main(String[] args) {

        Grad grad1 = new Grad("Teslic",40000);
        Grad grad2 = new Grad("Doboj",60000);
        Grad grad3 = new Grad("Banja Luka",200000);
        Grad grad4 = new Grad("Trebinje",20000);

        ArrayList<Grad> gradovi = new ArrayList<>();
        gradovi.add(grad1);
        gradovi.add(grad2);
        gradovi.add(grad3);
        gradovi.add(grad4);


        System.out.println(gradovi.toString());
    }
}
