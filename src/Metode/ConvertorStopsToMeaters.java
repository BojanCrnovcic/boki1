package Metode;

public class ConvertorStopsToMeaters {

    public static void ispis() {
        int metar =20;

        System.out.println("Stopa------Metar---|---Metar------Stopa");
        for (double stopa = 1; stopa<=10; stopa++){
            System.out.println(stopa+"          "+footToMeter(stopa)+"   |   "+metar+"      "+meterToFoot(metar));
            metar+=5;
        }

    }



    private static double footToMeter(double stopa){
         return 0.305*stopa;
    }
    private static double meterToFoot (double metar){
        double stopa = 3.279 * metar;
        return stopa;
    }
}
