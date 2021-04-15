package OBJEKTI;

public class BMITest {
    public static void main(String[] args) {


        BMI bmi = new BMI("PERO",34,90.5,170.0);

        System.out.println("Ime: "+bmi.getIme()+" ; godine: "+bmi.getGodine()+" ; BMI status: "+bmi.getBMIStatus());


    }
}
