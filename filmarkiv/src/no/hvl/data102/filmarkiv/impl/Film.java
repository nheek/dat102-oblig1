package no.hvl.data102.filmarkiv.impl;
import no.hvl.data102.filmarkiv.impl.Sjanger;
public class Film {
    private int filmNR;
    private String filmskaper;
    private String tittel;
    private int aar;
    private Sjanger sjanger;
    private String filmselskap;
    
    public Film(int filmNR, String filmskaper, String tittel, int aar, Sjanger sjanger, String filmselskap) {
        this.filmNR = filmNR;
        this.filmskaper = filmskaper;
        this.tittel = tittel;
        this.aar = aar;
        this.sjanger = sjanger;
        this.filmselskap = filmselskap;
    }
    
    // Hent and sett methods for filmNR
    public int hentFilmNR() {
        return filmNR;
    }

    public void settFilmNR(int filmNR) {
        this.filmNR = filmNR;
    }

    // Hent and sett methods for filmskaper
    public String hentFilmskaper() {
        return filmskaper;
    }

    public void settFilmskaper(String filmskaper) {
        this.filmskaper = filmskaper;
    }

    // Hent and sett methods for tittel
    public String hentTittel() {
        return tittel;
    }

    public void settTittel(String tittel) {
        this.tittel = tittel;
    }

    // Hent and sett methods for aar
    public int hentAar() {
        return aar;
    }

    public void settAar(int aar) {
        this.aar = aar;
    }

    // Hent and sett methods for sjanger
    public Sjanger hentSjanger() {
        return sjanger;
    }

    public void settSjanger(Sjanger sjanger) {
        this.sjanger = sjanger;
    }

    // Hent and sett methods for filmselskap
    public String hentFilmselskap() {
        return filmselskap;
    }

    public void settFilmselskap(String filmselskap) {
        this.filmselskap = filmselskap;
    }
    
    public static void main(String[] args) {
        System.out.println("test");
    }
}
