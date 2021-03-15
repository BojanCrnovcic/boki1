package Metode;

import java.util.Scanner;

public class GeometryAreaOfARegularPolygon6_36 {
    public static void main(String[] args) {
        area(5, 6.5);
        System.out.println("Povrsina poligona: " + area(5, 6.5));
    }


    public static double area(int n, double side) {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}
