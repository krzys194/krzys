package projekt2;

import java.util.GregorianCalendar;

public class Zbiory2 {
    private int ID;
    private GregorianCalendar datawydania;
    private String tytul;
    private String autor;
    private String wydawnictwo;
    private int wycena;

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
