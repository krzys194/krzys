package projekt3;

import java.util.ArrayList;
import java.util.Arrays;;
import java.util.Random;

public class BucketSorting implements Sortable {                        // implenentacja interfajsu
    public static int[] tab= new int[200];
    int count;

    void losowanie()                            // losowanie randomowych liczb
    {
        Random random = new Random();
        {
            for (int i = 0; i < 200; i++)
                tab[i] = random.nextInt(200);
        }
    }
    @Override
    public int sort(int[] tab) {
        int j;


        losowanie();                                                                          // metoda losowanie randomowo liczb
        System.out.println("\n To twoja nieposortowana tablica:\n");                                 // wyswietlenie wylosowanych losowo liczb
        for(int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");




        int[] temp = new int[200];                                                          // sortowanie kubełkowe
        Arrays.fill(temp, 0);                                        // wypenianie tabeli

        for (int i = 0; i < tab.length; i++) {
            temp[tab[i]]++;
            stepCounting();                                               // zliczanie operacji
        }

        int k=0;
        for (int i = 0; i < tab.length; i++) {
            for (j = 0; j<temp[i]; j++) {
                tab[k++] = i;
                stepCounting();                                             // zliczanie operacji
            }

        }

        System.out.println("\n");
        System.out.println("Posortowana tablica: ");

        for(int i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");                     // wyswietlenie posegregowanych liczb w tabeli metodą kubelkłkową
        System.out.println( "\n\nLiczba wykonanych operacji programu:  " + count);              // wyswietlenie wykonanych operacji
        return 0;
    }



    @Override
    public double stepCounting() {
        this.count++;                                                                              // liczenie przeprowadzonych operacji
        //  System.out.println("Liczba wykonanych operacji: " );

        return 0;
    }
}