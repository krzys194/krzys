package Instrukcja1;

import java.util.Scanner;

public class Main {

    public static String s;
    public static int mid;

    public static void main(String[] args) {
    half();
    }
    public static String half()
        {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Napisz coś: ");
        s = scaner.next();
        mid = s.length()/2;
        String[] halfS = {s.substring(0, mid)};
        System.out.println(halfS[0]);

            return halfS[0];
        }

}