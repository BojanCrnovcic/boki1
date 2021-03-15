package com.company;


import java.util.Random;

public class BacanjeNovcicapetlja {
    public static void main(String[] args) {
        Random rendom = new Random();
        System.out.println("Koliko ce puta novcic pasti na pismo ili glavu u milion pokusaja?");
        int pismo = 0;


        for (int i = 0; i < 1000000; i++) {
            int kovanica = (int) (Math.random() * 2);
            if (kovanica == 0) {

                pismo++;
            }
        }
            System.out.println("Novcic pada " + pismo + " na pismo");
            System.out.println("Novcic pada " + (1000000-pismo) + " na glavu");

        }
    }