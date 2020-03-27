package projekt2;

import java.util.GregorianCalendar; // biblioteka umozliwiajaca korzystac z klasy GregorianCalender do uzywania dat

public class Zbiory {
    private int ID;
    private GregorianCalendar datawydania;
    private String tytul;
    private String autor;
    private String wydawnictwo;
    private int wycena;

    public Zbiory(int ID, String tytul, String autor, String wydawnictwo, int wycena)        //konstruktor ze wskaznikiem na pola klasy (this)
    {
        this.ID=ID;
        this.tytul=tytul;
        this.autor=autor;
        this.wydawnictwo=wydawnictwo;
        this.wycena=wycena;

    }

}
