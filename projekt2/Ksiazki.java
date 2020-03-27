package projekt2;

public class Ksiazki extends Zbiory {                                             //dziedziczenie     rozszerzenie zbiorów
    private int liczbastron;



    public Ksiazki(int ID, String tytul, String autor, String wydawnictwo, int wycena) {                              //wywoływania konstruktorów klasy nadrzędnej
        super(ID, tytul, autor, wydawnictwo, wycena);
    }
}
