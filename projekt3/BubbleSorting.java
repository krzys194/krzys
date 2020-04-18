package projekt3;

import java.util.LinkedList;
import java.util.Random;

public class BubbleSorting implements Sortable {                            // implenentacja interfajsu
    public static int[] tab1= new int[200];                                 // okreslenie wielkosci tabeli
    int count;
     void losowanie()                                                   // metoda losowania randomowych liczb
    {
    Random random1 = new Random();
    {
        for (int i = 0; i < 200; i++)
            tab1[i] = random1.nextInt(200);
}
}
    @Override
    public int sort(int[] tab) {



      losowanie();                                                            // uzycie metody losowania liczb
            int i, j, temp;
            System.out.println("Wylosowane liczby: ");

            for(i = 0; i < tab.length; i++)System.out.print(tab[i] + " ");            // wyswietlenie wylosowanych losowo liczb

            System.out.println("\n");
            for (i = 0; i < tab.length - 1; i++){                                    // sortowanie metodą bąbelkową
                for (j = 0; j < tab.length - 1; j++){
                    if(tab[j] > tab[j + 1]){
                        temp = tab[j];
                        tab[j] = tab[j + 1];
                        tab[j + 1] = temp;
                        stepCounting();                                                 // zliczanie operacjii
                    }
                }
            }
            System.out.println("Posortowane liczby: ");                                         // wyswietlenie posegregowanych liczb w tabeli metoda bąbelkową
            for(i = 0; i < tab.length; i++) System.out.print(tab[i] + " ");
                 System.out.println( "\n\nLiczba wykonanych operacji programu:  " + count);                 // wyswietlenie wykonanych operacji
        return 0;
}



    @Override
    public double stepCounting() {                                                              // liczenie przeprowadzonych operacji
         this.count++;
      //  System.out.println("Liczba wykonanych operacji: " );

        return 0;
    }



}
