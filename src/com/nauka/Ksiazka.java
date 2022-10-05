package com.nauka;

public class Ksiazka {
    private String tytul;
    private Osoba autor;
    private boolean pozyczone;

    public Ksiazka(String tytul, Osoba autor) {
        this.tytul = tytul;
        this.autor = autor;
        this.pozyczone = false;
    }

    public String getTytul() { return tytul; }
    public Osoba getAutor() { return autor; }
    public boolean isPozyczone() { return pozyczone; }

    public void setPozyczone(boolean pozyczone) { this.pozyczone = pozyczone; }


    public String toString() {
        return "[\"" + tytul + "\", autor:" + autor.getImie() + " " + autor.getNazwisko() + ", pozyczone: " + (((pozyczone)?"tak":"nie") + "]");
    }
}
