package NIZOVI;

public class RandomNumberChooser7_13 {
    public static void main(String[] args) {
        int broj = 0;
        System.out.println("Slucajni broj je :"+getRandom(12,13,14));
    }

    public static int getRandom (int... Numbers){
        int slucajniBroj = (int)(1+Math.random()*54);
        return slucajniBroj;
    }
}
