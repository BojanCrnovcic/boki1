package OBJEKTI;

public class StudentTest {
    public static void main(String[] args) {

        Student student1 = new Student();

        student1.setIme("Pero Peric");
        student1.setGodine(28);
        student1.setPol('M');
        student1.setProsjekOcjena(7.9);

        System.out.println("Ime: "+student1.getIme());
        System.out.println("Godine: "+student1.getGodine());
        System.out.println("Pol: "+student1.getPol());
        System.out.println("Porosjek ocjena: "+student1.getProsjekOcjena());

        Student student2 = new Student();


    }
}
