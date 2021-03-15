package Metode;

public class ZadatakPonavljanje {



    public static String removeChar(String str, char ch){
        String rijesenje = "";
        for (int i =0;i<str.length();i++){
            if (str.charAt(i)!=ch){
                rijesenje+=str.charAt(i);
            }

        }return rijesenje;
    }
}
