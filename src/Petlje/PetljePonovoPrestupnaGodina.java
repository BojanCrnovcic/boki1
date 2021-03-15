package Petlje;

public class PetljePonovoPrestupnaGodina {
    public static void main(String[] args) {
        int pocetnaGodina = 101;
        int finalnaGodina =2100;
        int brojac = 0;
        System.out.println("Presupne godine u periodu 101-2100:");

        for (int godina = pocetnaGodina = 101;godina<finalnaGodina;godina++){
            if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0){
                brojac++;
                System.out.print(godina+" ");
            }
            if (brojac % 10== 0){
                brojac++;
                System.out.println();

            }
        }
    }
}
