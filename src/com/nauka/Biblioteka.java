package com.nauka;

import java.util.ArrayList;

public class Biblioteka {
    private static final Biblioteka biblioteka = new Biblioteka();

    private static ArrayList<Czytelnik> czytelnik = new ArrayList<Czytelnik>();
    private static ArrayList<Ksiazka> ksiazka = new ArrayList<Ksiazka>();
    private static ArrayList<Bibliotekarz> bibliotekarze = new ArrayList<Bibliotekarz>();

    private Biblioteka() {}
    public static Biblioteka getInstance() { return biblioteka;	}

    public static ArrayList<Ksiazka> getKsiazka() { return ksiazka; }
    public static ArrayList<Czytelnik> getCzytelnik () { return czytelnik; }
    public static ArrayList<Bibliotekarz> getBibliotekarze() { return bibliotekarze; }


    public static void addKsiazka(String tytul, Osoba autor) {
        ksiazka.add(new Ksiazka(tytul, autor));
        System.out.println("Ksiazka \"" + tytul + "\" dodana do biblioteki");
    }

    public static void addCzytelnik(Osoba osoba) {
        czytelnik.add(new Czytelnik(osoba.getImie(), osoba.getImie(), osoba.getDataUrodzin()));
        System.out.println("Czytelnik " + osoba.getImie() + " " + osoba.getNazwisko() + " dodano do biblioteki");
    }

    public static void addBibliotekarz(Osoba osoba, String dataZatrudnienia) {
        bibliotekarze.add(new Bibliotekarz(osoba.getImie(), osoba.getNazwisko(), osoba.getDataUrodzin(), dataZatrudnienia));
        System.out.println("Czytelnik " + osoba.getImie() + " " + osoba.getNazwisko() + " dodano do Biblioteki");
    }
}
