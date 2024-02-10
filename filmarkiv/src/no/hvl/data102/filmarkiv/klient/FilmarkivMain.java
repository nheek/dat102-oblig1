package no.hvl.data102.filmarkiv.klient;
import no.hvl.data102.filmarkiv.adt.FilmArkivADT;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Filmarkiv2;

public class FilmarkivMain {
	public static void main(String[] args) {
		FilmArkivADT filma = new Filmarkiv2();
		Meny meny = new Meny(filma);
		meny.start();
	}
}
