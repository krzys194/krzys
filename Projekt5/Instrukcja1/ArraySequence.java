package Instrukcja1;

public class Main {

    public static int[] tab;
    public static boolean s;

    public static void main(String args[]) {
        tab = new int[]{1,2,3};
        sekwencja(tab);
    }
    public static boolean sekwencja(int tab[]) {
        for (int i = 0; i < tab.length-2; i++) {
            if (tab[i] == 1 && tab[i+1] == 2 && tab[i+2] == 3) {
                s = true;
            } else {
                s = false;
            }
        }
        return s;
    }
}