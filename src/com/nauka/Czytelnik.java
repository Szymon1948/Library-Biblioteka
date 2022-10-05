package com.nauka;

import java.util.ArrayList;

public class Czytelnik {
    private int id;
    private ArrayList<Ksiazka> pozyczone;

    public Czytelnik(String imie, String nazwisko, String DataUrodzin) {

        this.id = (Biblioteka.getCzytelnik().size() + 1);
        this.pozyczone = new ArrayList<Ksiazka>();
    }

    public int getId() {
        return id;
    }

    public ArrayList<Ksiazka> getPozyczone() {
        return pozyczone;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String toString() {
        return "[\"" + getImie() + " " + getNazwisko() + "\" *: " + getDataUroddzin() + ", id: " + id + "]";
    }

    public void borrowBook(Ksiazka ksiazka) {
        if (ksiazka.isPozyczone()) {
            System.out.println("Book \"" + ksiazka.getTytul() + "\" is already borrowed");
        } else {
            ksiazka.setPozyczone(true);
            pozyczone.add(ksiazka);
            System.out.println("Book \"" + ksiazka.getTytul() + "\" borrowed by " + getImie() + " " + getNazwisko());
        }
    }

    public void returnBook(Ksiazka ksiazka) {
        if (!ksiazka.isPozyczone()) {
            System.out.println("Book \"" + ksiazka.getTytul() + "\" is not borrowed");

        } else if (!pozyczone.contains(ksiazka)) {
            System.out.println("Book \"" + ksiazka.getTytul() + "\" is not borrowed by " + getImie() + " " + getNazwisko());

        } else {
            ksiazka.setPozyczone(false);
            pozyczone.remove(ksiazka);
            System.out.println("Book \"" + ksiazka.getTytul() + "\" returned by " + getImie() + " " + getNazwisko());
        }
    }
    public String getImie() {
        String imie = new String()     ;
        return imie;
    }

    public String getNazwisko() {
        String nazwisko = new String()  ;

        return nazwisko;
    }

    public  String getDataUroddzin(){
        String DataUrodzin = new String();

        return DataUrodzin;
    }
}
