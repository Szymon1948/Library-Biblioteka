package com.nauka;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String DataUrodzin;

    public Osoba(String imie, String nazwisko, String DataUrodzin) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.DataUrodzin = DataUrodzin;
    }

    public String getImie() { return imie; }
    public String getNazwisko() { return nazwisko; }
    public String getDataUrodzin() { return DataUrodzin; }

    public void setImie(String imie) { this.imie = imie; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }
    public void setDataUrodzin(String DataUrodzin) { this.DataUrodzin=DataUrodzin; }


    public String toString() {
        return "[\"" + imie + " " + nazwisko + "\" : " + DataUrodzin + "]";
    }
}
