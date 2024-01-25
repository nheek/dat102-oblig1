package no.hvl.data102.filmarkiv.klient;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

import java.util.Scanner;

import no.hvl.data102.filmarkiv.adt.FilmArkivADT;

public class TekstGrensesnitt {
	// Leser inn opplysninger om en film fra tastatur og returnere et Film-objekt
	public Film lesFilm(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Skriv inn filmnummer: ");
        int filmNR = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Skriv inn filmskaper: ");
        String filmskaper = scanner.nextLine();

        System.out.print("Skriv inn tittel: ");
        String tittel = scanner.nextLine();

        System.out.print("Skriv inn år: ");
        int aar = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Skriv inn sjanger: ");
        String sjanger = scanner.nextLine();
        Sjanger sjangerReal = Sjanger.valueOf(sjanger);
        
        System.out.print("Skriv inn filmselskap: ");
        String filmselskap = scanner.nextLine();

        
        Film filmFound = new Film(filmNR, filmskaper, tittel, aar, sjangerReal, filmselskap);

        scanner.close();
        
        return filmFound;
	}
	// Skriver ut en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void skrivUtFilm(Film film) {
		System.out.println("-".repeat(10));
		System.out.println("Film NR: " + film.hentFilmNR());
		System.out.println("Filmskaper: " + film.hentFilmskaper());
		System.out.println("Tittel: " + film.hentTittel());
		System.out.println("År: " + film.hentAar());
		System.out.println("Sjanger: " + film.hentSjanger());
		System.out.println("Filmselskap: " + film.hentFilmselskap());
		System.out.println("-".repeat(10));
	}
	// Skriver ut alle filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmArkivADT arkiv, String delstreng) {
		Film[] skrivUt = arkiv.soekTittel(delstreng);
		for(int x = 0; x < skrivUt.length; x++) {
			Film film = skrivUt[x];
			System.out.println(film.hentTittel());
		}
	}
	// Skriver ut alle Filmer av en produsent (produsent er delstreng)
	public void skrivUtFilmProdusent(FilmArkivADT arkiv, String delstreng) {
		Film[] skrivUtHer = arkiv.soekProdusent(delstreng);
		for(int x = 0; x < skrivUtHer.length; x++) {
			Film film = skrivUtHer[x];
			if (film != null) {
				System.out.println(film.hentTittel());
			}
		}
	}
	// Skriver ut en enkel statistikk som inneholder antall filmer totalt
	// og hvor mange det er i hver sjanger.
	public void skrivUtStatistikk(FilmArkivADT arkiv) {
		int antallFilm = arkiv.antall();
		Sjanger[] sjangTab = Sjanger.values();
		
		System.out.println("Antall filmer: " + antallFilm);
		
		for (int x = 0; x < sjangTab.length; x++) {
			System.out.println(sjangTab[x] + ": " + arkiv.antall(sjangTab[x]));
		}
		
		
	}
}
