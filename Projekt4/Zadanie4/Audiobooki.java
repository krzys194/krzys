package projekt2;

public class Audiobooki extends Zbiory {                                             //dziedziczenie     rozszerzenie zbiorów
    private int wagapliku;



    public Audiobooki(int ID, String tytul, String autor, String wydawnictwo, int wycena) {
        super(ID, tytul, autor, wydawnictwo, wycena);                                                                               //wywoływania konstruktorów klasy nadrzędnej
    }
}
