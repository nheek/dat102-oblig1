package no.hvl.data102.filmarkiv.klient;
import no.hvl.data102.filmarkiv.adt.FilmArkivADT;
import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class Meny {
	private TekstGrensesnitt tekstgr;
	private FilmArkivADT filmarkiv;
	
	public Meny(FilmArkivADT filmarkiv){
		tekstgr = new TekstGrensesnitt();
		this.filmarkiv = filmarkiv;
	}
	
	public void start(){
	// legg inn en del forhåndsdefinerte filmer for å teste metodene
		Film film1 = new Film(1, "ThisFilmskaper", "ATitle", 2000, Sjanger.ACTION, "ThisFilmselskap");
	    Film film2 = new Film(2, "ThatFilmskaper", "HiTitle", 2020, Sjanger.DRAMA, "ThatFilmselskap");
		Film film3 = new Film(5, "MyFilmskaper", "MyTitle", 1999, Sjanger.SCIFI, "WowSelskap");
		
		filmarkiv.leggTilFilm(film1);
	    filmarkiv.leggTilFilm(film2);
	    filmarkiv.leggTilFilm(film3);
	    
	    // skrivUtFilm testet og funker
	    //tekstgr.skrivUtFilm(film1);
	    
	    // skrivUtFilmDelstrengITittle testet og funker
	    //tekstgr.skrivUtFilmDelstrengITittel(filmarkiv, "Title");
	    
	    // skrivUtFilmProdusent testet og IKKE funker
	    tekstgr.skrivUtFilmProdusent(filmarkiv, "Filmsk");

	    // skrivUtFilm og lesFilm testet og funker
	    //tekstgr.skrivUtFilm(tekstgr.lesFilm());
	    
	    // skrivUtStatistikk testet og funker
	    //tekstgr.skrivUtStatistikk(filmarkiv);
	    
	}
}
