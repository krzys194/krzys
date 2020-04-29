package projekt2;


import java.util.Scanner; 												// dodalem biblioteke, zeby móc użyc klasy Scanner do wpisywania

public class Main {

    public static void main(String[] args) {

    	int liczba;
		Scanner scaner = new Scanner(System.in);





	 Uzytkownik uzytkownik1 = new Uzytkownik();														//tworzenie objektu uzytkownika

		uzytkownik1.wpiszInfo();      											 //uzycie metody pobierania danych uzytkownika

			do
			{

				uzytkownik1.iloscInfo();                           				 //uzycie metody pokazywania ilosci wyporzyczonych rzeczy
				System.out.println("1. Wypozycz\n" +                			  // menu wyboru
				"2. Informacje o koncie\n" +
						"3. Oddaj\n" +
						"4. Wyjscie\n"  +
						"Wybor: ");
				liczba=scaner.nextInt();
				switch(liczba) {              									 //ustalenie wyboru znakami z klawiatury
					case 1:
							uzytkownik1.maxWypozyczen();                  // uzycie metody do okreslenia moksymalnej liczby wyporzyczonych rzeczy
						break;
					case 2:
						uzytkownik1.infoOUzytkowniku();
						System.out.println("Masz jeszcze czas na oddanie, baw sie dobrze! :D ");
						break;
					case 3:
						uzytkownik1.oddaj();
						break;
					default:
						System.out.println("Wybierz jeszcz raz!");
					break;
						}

			} while(liczba != 4);
			System.out.println("Twoje konto zostalo zablokowane, ponieważ zalegasz z wypozyczonymi rzeczami!!!! musisz oddac wszystkie porzyczone rzeczy lub zwrócic ich równowartość  ");
	}
}
