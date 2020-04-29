package projekt2;

public class Muzyka extends Zbiory {                                                  //dziedziczenie     rozszerzenie zbiorów
    private int wagapiosenki;

    public Muzyka(int ID, String tytul, String autor, String wydawnictwo, int wycena) {                              //wywoływania konstruktorów klasy nadrzędnej
        super(ID, tytul, autor, wydawnictwo, wycena);
    }
}