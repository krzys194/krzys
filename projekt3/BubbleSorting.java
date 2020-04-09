package projekt3;

import java.util.LinkedList;
import java.util.Random;

public class BubbleSorting implements Sortable {                            // implenentacja interfajsu
    public static int[] tabb= new int[200];                                 // okreslenie wielkosci tabeli
    int count;
     void losowanie()                                                   // metoda losowania randomowych liczb
    {
    Random random1 = new Random();
    {
        for (int i = 0; i < 200; i++)
            tabb[i] = random1.nextInt(200);
}
}
    @Override
    public int sort(int[] tabb) {



      losowanie();                                                            // uzycie metody losowania liczb
            int i, j, temp;
            System.out.println("Wylosowane liczby: ");

            for(i = 0; i < tabb.length; i++)System.out.print(tabb[i] + " ");            // wyswietlenie wylosowanych losowo liczb

            System.out.println("\n");
            for (i = 0; i < tabb.length - 1; i++){                                    // sortowanie metodą bąbelkową
                for (j = 0; j < tabb.length - 1; j++){
                    if(tabb[j] > tabb[j + 1]){
                        temp = tabb[j];
                        tabb[j] = tabb[j + 1];
                        tabb[j + 1] = temp;
                        stepCounting();                                                 // zliczanie operacjii
                    }
                }
            }
            System.out.println("Posortowane liczby: ");                                         // wyswietlenie posegregowanych liczb w tabeli metoda bąbelkową
            for(i = 0; i < tabb.length; i++) System.out.print(tabb[i] + " ");
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
