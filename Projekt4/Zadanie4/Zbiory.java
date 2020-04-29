package projekt2;

import java.util.GregorianCalendar; // biblioteka umozliwiajaca korzystac z klasy GregorianCalender do uzywania dat

public class Zbiory {
    private Zbiory2 zbiory2;
    private int ID;
    private GregorianCalendar datawydania;
    private String tytul;
    private String autor;
    private String wydawnictwo;
    private int wycena;

    public Zbiory(int ID, String tytul, String autor, String wydawnictwo, int wycena)        //konstruktor ze wskaznikiem na pola klasy (this)
    {
        this.zbiory2= new Zbiory2();
        zbiory2.podajID(ID);
        zbiory2.podajTytul(tytul);
        zbiory2.podajAutora(autor);
        zbiory2.podajWydawnictwo(wydawnictwo);
        zbiory2.podajCene(wycena);
    }

    public void podajID(int ID)
    {
        this.ID=ID;
    }
    public void podajTytul(String tytul)
    {
        this.tytul=tytul;
    }
    public void podajAutora(String autor)
    {
        this.autor=autor;
    }
    public void podajWydawnictwo(String wydawnictwo)
    {
        this.wydawnictwo=wydawnictwo;
    }
    public void podajCene(int wycena)
    {
        this.wycena=wycena;
    }
    public int getID()
    {
        return ID;
    }
    public String getTytul()
    {
        return tytul;
    }
    public String getAutor()
    {
        return autor;
    }
    public String getWydawnictwo()
    {
        return wydawnictwo;
    }
    public int getWycena()
    {
        return wycena;
    }

}
