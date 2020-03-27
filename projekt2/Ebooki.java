package projekt2;

public class Ebooki extends Zbiory {                                             //dziedziczenie     rozszerzenie zbiorów
    private int wagaksiazki;
    private int liczbastron;



    public Ebooki(int ID, String tytul, String autor, String wydawnictwo, int wycena) {
        super(ID, tytul, autor, wydawnictwo, wycena);                              //wywoływania konstruktorów klasy nadrzędnej
    }
}
