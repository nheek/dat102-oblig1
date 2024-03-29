package no.hvl.data102.filmarkiv.impl;

import no.hvl.data102.filmarkiv.adt.FilmArkivADT;

public class Filmarkiv2 implements FilmArkivADT {
    private LinearNode<Film> start;
    private int antall;

    public Filmarkiv2() {
        this.start = null;
        this.antall = 0;
    }

    @Override
    public Film finnFilm(int nr) {
        LinearNode<Film> current = start;

        while (current != null) {
            if (current.getElement().hentFilmNR() == nr) {
                return current.getElement();
            }
            current = current.getNext();
        }

        return null;
    }

    @Override
    public void leggTilFilm(Film nyFilm) {
    	// TODO Auto-generated method stub
        LinearNode<Film> newNode = new LinearNode<>(nyFilm);

        if (start == null) {
            start = newNode;
        } else {
            LinearNode<Film> current = start;

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(newNode);
        }

        antall++;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        LinearNode<Film> current = start;
        LinearNode<Film> previous = null;

        while (current != null && current.getElement().hentFilmNR() != filmnr) {
            previous = current;
            current = current.getNext();
        }

        if (current != null) {
            if (previous != null) {
                previous.setNext(current.getNext());
            } else {
                start = current.getNext();
            }
            antall--;
            return true;
        }

        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
    	// TODO Auto-generated method stub
        Film[] result = new Film[antall];
        int index = 0;
        LinearNode<Film> current = start;

        while (current != null) {
            if (current.getElement().hentTittel().contains(delstreng)) {
                result[index++] = current.getElement();
            }
            current = current.getNext();
        }
        
        // håper den funker
        Film[] trimmedResult = new Film[index];
        System.arraycopy(result, 0, trimmedResult, 0, index);

        return trimmedResult;
    }

    @Override
    public Film[] soekProdusent(String delstreng) {
    	// TODO Auto-generated method stub
        Film[] result = new Film[antall];
        int index = 0;
        LinearNode<Film> current = start;

        while (current != null) {
            if (current.getElement().hentFilmskaper().contains(delstreng)) {
                result[index++] = current.getElement();
            }
            current = current.getNext();
        }
        
        // håper den funker
        Film[] trimmedResult = new Film[index];
        System.arraycopy(result, 0, trimmedResult, 0, index);

        return trimmedResult;
    }
    @Override
    public int antall(Sjanger sjanger) {
    	// TODO Auto-generated method stub
        int count = 0;
        LinearNode<Film> current = start;

        while (current != null) {
            if (current.getElement().hentSjanger() == sjanger) {
                count++;
            }
            current = current.getNext();
        }

        return count;
    }

    @Override
    public int antall() {
    	// TODO Auto-generated method stub
        return antall;
    }
}
