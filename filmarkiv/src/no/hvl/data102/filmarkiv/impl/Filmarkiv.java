package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmArkivADT;
import no.hvl.data102.filmarkiv.impl.Sjanger;
import no.hvl.data102.filmarkiv.impl.Film;
public class Filmarkiv implements FilmArkivADT {
    Film[] filmarkivTabell = new Film[] {
        
    };

    public Filmarkiv (int antallFilm) {
        this.filmarkivTabell = new Film[antallFilm];
    }
    
    @Override
    public Film finnFilm(int nr) {
        throw new UnsupportedOperationException("Unimplemented method 'leggTilFilm'");
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'leggTilFilm'");
    }

    @Override
    public boolean slettFilm(int filmnr) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'slettFilm'");
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'soekTittel'");
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'soekProdusent'");
    }

    @Override
    public int antall(Sjanger sjanger) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'antall'");
    }

    @Override
    public int antall() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'antall'");
    }

}
