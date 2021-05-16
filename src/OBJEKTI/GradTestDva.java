package OBJEKTI;

import java.util.ArrayList;

public class GradTestDva {
    public static void main(String[] args) {



        ArrayList<String> gradovi = new ArrayList<>();
        gradovi.add("Teslic");
        gradovi.add("Banja Luka");
        gradovi.add("Trebinje");
        gradovi.add(2,"Doboj");
        gradovi.add(0,"Bijeljina");

        for (String e : gradovi){

        System.out.print(e+ " ");}
    }
}
