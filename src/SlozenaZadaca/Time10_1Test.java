package SlozenaZadaca;

public class Time10_1Test {
    public static void main(String[] args) {

        Time10_1 test1 = new Time10_1();
        Time10_1 test2 = new Time10_1(555550000);
        Time10_1 test3 = new Time10_1(5,23,55);

        System.out.println("Rezultat vremena bez argumenta je "+test1.getSat()+":"+test1.getMinut()+":"+test1.getSekund());
        System.out.println("Rezultat vremena sa jednim argumentom je "+test2.getSat()+":"+test2.getMinut()+":"+test2.getSekund());
        System.out.println("Rezultat vremena sa tri argumenta je "+test3.getSat()+":"+test3.getMinut()+":"+test3.getSekund());




    }
}
