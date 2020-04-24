package Projekt4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("\nPodaj liczbe:");
            String s = scanner.nextLine();
            try {
                int i = Integer.parseInt(s);
                System.out.println(" String ---> Int : " + i);
            } catch (NumberFormatException e) {
                System.err.println(" Zły format! (" + s + ") nie jest liczbą!");
            }
        }

    }

}


