package projekt2;




import java.util.Scanner;

public class Uzytkownik {                                                       //zdeklarowanie klas
    private String imie;                                                        // ustawianie specyfikatora dostepu do ponizszych zmiennych
    private String nazwisko;
    private String adres;
    private int wiek;
    private int iloscWypozyczonych;
    public Scanner scan = new Scanner(System.in);

        public Uzytkownik()
        {
            this.imie = "imie";                                                 //wskazania na pola klasy
            this.nazwisko = "nazwisko";
            this.adres = "adres";
            this.wiek = 0;
            iloscWypozyczonych = 0;

       }

       public void maxWypozyczen() {
           if (iloscWypozyczonych < 3) {                                                                                    // funkcja wypozyczania rzeczy
               iloscWypozyczonych++;
               System.out.println("Cos wypozyczyles!!!");
           } else {
               System.out.println("Maksymalna ilosc wypozycze!n");
           }
       }


            public void oddaj() {
            if (iloscWypozyczonych >0) {                                                                                    //funkcja oddawania rzeczy
                iloscWypozyczonych--;
                System.out.println("Oddales!");
            } else System.out.println("Oddales wszystkie ksiazki!");
           }

           public void iloscInfo() {                                                                                //metoda pokazywania ilosci wypozyczonych rzeczy
               System.out.println("| ilosc wypozyczonych rzeczy:  " + iloscWypozyczonych);
           }

           public void infoOUzytkowniku(){                                                          //metoda wypisywania informacji o uzytkowniku
               System.out.println("Dane:");
               System.out.println("|  imie: " + this.imie);
               System.out.println("|  nazwisko: " + this.nazwisko);
               System.out.println("|  Adres: " + this.adres);
               System.out.println("|  Wiek: " + this.wiek);
           }

           public void wpiszInfo() {                                                            // metoda pobierania danych od uzytkownika
               System.out.println(" Podaj swoje imie, nazwisko, adres, wiek!");
               System.out.println("|  imie: ");
               imie = scan.nextLine();
               System.out.println("|  nazwisko: ");
               nazwisko = scan.nextLine();
               System.out.println("|  Adres: ");
               adres = scan.nextLine();
               System.out.println("|  Wiek: ");
               wiek = scan.nextInt();

           }
}
