package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmArkivADT;
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
    	if (antall < arkiv.length) {
    		arkiv[antall] = nyFilm;
            antall++;
    	} else {
    		Film[] dobbelArkiv = new Film[arkiv.length * 2];
    		antall = 0;
    		
    		for (int x = 0; x < arkiv.length; x++) {
    			dobbelArkiv[x] = arkiv[x];
    			antall++;
    		}
    		
    		this.arkiv = dobbelArkiv;
    		
    		leggTilFilm(nyFilm);
    	}
        
    }

    @Override
    public boolean slettFilm(int filmnr) {
        for (int x = 0; x < arkiv.length; x++) {
        	if (arkiv[x] != null && (arkiv[x].hentFilmNR() == filmnr)) {
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
    		if (film != null && film.hentTittel().contains(delstreng)) {
    			antall++;
    		}
    	}

    	Film[] result = new Film[antall];

    	for (int x = 0; x < antall; x++) {
    		if (arkiv[x] != null && arkiv[x].hentTittel().contains(delstreng)) {
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
    		if (film != null && film.hentFilmskaper().contains(delstreng)) {
    			antall++;
    		}
    	}

    	Film[] result = new Film[antall];

    	for (int x = 0; x < antall; x++) {
    		if (arkiv[x] != null && arkiv[x].hentFilmskaper().contains(delstreng)) {
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
        	if (film != null && film.hentSjanger() == sjanger) {
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
