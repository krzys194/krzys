package Zadanie3;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Tablica {
    int[] tab = new int[200];

    void losowanie() {
        Random random = new Random();
        {
            for (int i = 0; i < 200; i++)
                tab[i] = random.nextInt(200);

        }


        System.out.println("\n Twoja tablica (200 elementów):");
        for (int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
    }

    void getint() {
        for (;;) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("\n Podaj nnumer liczby którą chcesz wyswietlić:");

            try
            {
                int s = scanner.nextInt();
                System.out.println("Wybrana liczba to: " + tab[s-1]);
            } catch (ArrayIndexOutOfBoundsException e)
            {
                System.err.println("Nie ma tyle liczba w zbiorze!!!");
            } catch (InputMismatchException ee)
            {
                System.err.println(" Zły format!");

            }
        }
    }
}