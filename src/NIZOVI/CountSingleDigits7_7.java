package NIZOVI;

public class CountSingleDigits7_7 {
    public static void main(String[] args) {

        int [] counts = new int[10];
        int slucajniBroj = 0;

        for (int i=0;i<100;i++){
            slucajniBroj =(int) (Math.random()*10);
            counts[slucajniBroj]++;
        }
        for (int i = 0; i<counts.length;i++){
            System.out.print(counts[i]+" counts of ");
            System.out.println(i);
        }
    }
}
