package Instrukcja1;


import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj 1 temperature: ");
        int t1 = scanner.nextInt();
        System.out.println("Podaj 2 temperature: ");
        int t2 = scanner.nextInt();
       temperatura(t1, t2);

    }
    public static boolean temperatura(int t1, int t2) {
        if(t1<100 || t2<100)
        {
            return true;
        }
        else
            {
            return false;
            }
    }
}