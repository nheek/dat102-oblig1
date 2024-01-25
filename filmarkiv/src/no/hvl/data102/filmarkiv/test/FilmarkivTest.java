package no.hvl.data102.filmarkiv.test;
// import lib.junit;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.data102.filmarkiv.impl.Film;
import no.hvl.data102.filmarkiv.impl.Filmarkiv;
import no.hvl.data102.filmarkiv.impl.Sjanger;

public class FilmarkivTest {
	private Filmarkiv arkiv;
	private Film film1 = new Film(1, "ThisFilmskaper", "ATitle", 2000, Sjanger.ACTION, "ThisFilmselskap");
    private Film film2 = new Film(2, "ThatFilmskaper", "HiTitle", 2020, Sjanger.DRAMA, "ThatFilmselskap");
	private Film film3 = new Film(5, "MyFilmskaper", "MyTitle", 1999, Sjanger.SCIFI, "WowSelskap");
	
	@BeforeEach
    public void BeforeTest() {
    	arkiv = new Filmarkiv(5);

    	arkiv.leggTilFilm(film1);
    	arkiv.leggTilFilm(film2);
    	arkiv.leggTilFilm(film3);
    }

    @Test
    public void testFilmArkiv() {
    	assertEquals(3, arkiv.antall());
    	// assertEquals(film1, arkiv.finnFilm(1));
    	// assertEquals(film3, arkiv.finnFilm(5));
    }
    
    @Test
    public void testFinnFilm() {
    	assertEquals(film1, arkiv.finnFilm(1));
    	assertEquals(film3, arkiv.finnFilm(5));
    }
    
    @Test
    public void testLeggTilFilm() {
    	arkiv.leggTilFilm(film1);
    	assertEquals(4, arkiv.antall());
    	
    	arkiv.leggTilFilm(film2);
    	assertTrue(arkiv.antall() == 5);
    	
    	for (int x = 0; x < 20; x++) {
    		arkiv.leggTilFilm(film2);
    	}
    }
    
    @Test
    public void testSlettFilm() {
    	assertTrue(arkiv.slettFilm(1));
    	assertFalse(arkiv.slettFilm(10));
    }
    
    @Test
    public void testEquals() {
    	assertTrue(arkiv.finnFilm(1).equals(film1));
    	assertFalse(arkiv.finnFilm(1).equals(film2));
    }
    
    @Test
    public void testSoekProdusent() {
    	Film[] arkivHer = arkiv.soekProdusent("That");
    	Film[] arkivHer1 = arkiv.soekProdusent("skaper");
    	
    	assertTrue(arkivHer.length == 1);
    	assertTrue(arkivHer1.length == 3);
    }
}
