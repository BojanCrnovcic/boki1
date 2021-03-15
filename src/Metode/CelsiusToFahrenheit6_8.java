package Metode;

public class CelsiusToFahrenheit6_8 {
    public static void main(String[] args) {

        System.out.println("Celsius--Fahrenheit---|---Fahrenheit--------Celsius");
        for (double i = 40.0, j = 120.0; i>=31.0 && j>=30.0; i--, j-=10){
            System.out.println(i+"   "+celsiusToFahrenheit(i)+"  |  "+j+"   "+fahrenheitToCelsius(j));
        }

    }





    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit =  (9.0 / 5) * celsius + 32;
        return fahrenheit;

    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;


    }
}
