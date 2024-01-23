package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmArkivADT;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import no.hvl.data102.filmarkiv.impl.Film;
public class Filmarkiv implements FilmArkivADT {
   int antall;
   Film[] arkiv;

    public Filmarkiv (int antallFilm) {
        this.arkiv = new Film[antallFilm];
        this.antall = 0;
    }
    
    
    @Override
    public Film finnFilm(int nr) {
        for (Film film : arkiv) {
        	if (film.hentFilmNR() ==  nr) {
        		return film;
        	}
        }
        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        // TODO Auto-generated method stub
        arkiv[antall] = nyFilm;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        // TODO Auto-generated method stub
        for (int x = 0; x < arkiv.length; x++) {
        	if (arkiv[x].hentFilmNR() == filmnr) {
        		arkiv[x] = null;
        		return true;
        	}
        }
        
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        // TODO Auto-generated method stub
        //Film[] result = 
    	int antall = 0;
    	for (Film film : arkiv) {
    		if (film.hentTittel().contains(delstreng)) {
    			antall++;
    		}
    	}
    	
    	Film[] result = new Film[antall];
    	
    	for (int x = 0; x < antall; x++) {
    		if (arkiv[x].hentTittel().contains(delstreng)) {
    			result[x] = arkiv[x];
    		}
    	}
    	
    	return result;
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        // TODO Auto-generated method stub
    	int antall = 0;
    	for (Film film : arkiv) {
    		if (film.hentFilmskaper().contains(delstreng)) {
    			antall++;
    		}
    	}
    	
    	Film[] result = new Film[antall];
    	
    	for (int x = 0; x < antall; x++) {
    		if (arkiv[x].hentFilmskaper().contains(delstreng)) {
    			result[x] = arkiv[x];
    		}
    	}
    	
    	return result;
    }

    @Override
    public int antall(Sjanger sjanger) {
        // TODO Auto-generated method stub
        int antall = 0;
        
        for (Film film : arkiv) {
        	if (film.hentSjanger() == sjanger) {
        		antall++;
        	}
        }
        
        return antall;
    }

    @Override
    public int antall() {
        // TODO Auto-generated method stub
        return antall;
    }

}
