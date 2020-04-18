package projekt3;

import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

import static projekt3.BucketSorting.tab;
import static projekt3.BubbleSorting.tab1;


public class Main {

    public static void main(String[] args) {
    int liczba;
        System.out.println("\n|PROGRAM WYLOSUJE 200 RANDOMOWYCH LICZB, A NASTEPNIE JE POSORTUJE|");            // instrukcja
                System.out.println("                  |WYBIERZ RODZAJ SORTOWANIA|");
    Scanner scaner = new Scanner(System.in);

        do
        {


            System.out.println("\n" +                                         // menu wyboru
                    "____________________\n" +
                    "1. Sortuj Bąbelkowo\n" +
                    "2. Sortuj Kubełkowo\n" +
                    "3. Wyjscie\n"  +
                    "____________________\n" +
                    "Wybor: ");
            liczba = scaner.nextInt();
            switch(liczba) {              									 //ustalenie wyboru znakami z klawiatury
                case 1:
                    BubbleSorting bubblesorting = new BubbleSorting();        // sortowanie babelkowe
                    Sortable sortable = bubblesorting;
                    sortable.sort(tab1);
                    break;
                case 2:
                    BucketSorting bucketSorting = new BucketSorting();         // sortowanie kubełkowe
                    Sortable sortable1 = bucketSorting;
                    sortable1.sort(tab);

                    break;
                case 3:                                                         // zamknięci eprogramu
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wybierz jeszcz raz!");
                    break;
            }

        } while(liczba != 3);
        System.out.println(" Zegnaj!  ");
    }


    }


