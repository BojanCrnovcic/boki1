package Metode;

public class ConversionsBetweenFeetAndMeters6_9 {
    public static void main(String[] args) {

        System.out.println("Stopa------Metar---|---Metar------Stopa");
        for (double i = 1, j = 20; i<=10 && j<=65; i++,j+=5){
            System.out.println(i+"          "+footToMeter(i)+"   |   "+j+"      "+meterToFoot(j));
        }

    }



    public static double footToMeter(double stopa){
        double metar = 0.305*stopa;
        return metar;
    }
    public static double meterToFoot (double metar){
        double stopa = 3.279 * metar;
        return stopa;
    }
}
