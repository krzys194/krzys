package projekt2;

public class FIlmy extends Zbiory {                                 //dziedziczenie     rozszerzenie zbiorów
    private int wagafilmu;


    public FIlmy(int ID, String tytul, String autor, String wydawnictwo, int wycena)                              //wywoływania konstruktorów klasy nadrzędnej
    {
        super(ID,tytul,autor,wydawnictwo,wycena);
    }
}
