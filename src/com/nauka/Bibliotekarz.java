package com.nauka;

public class Bibliotekarz {
    private String DataKlienta;

    public Bibliotekarz(String imie, String nazwisko, String DataUrodzin, String DataKlienta) {

        this.DataKlienta = DataKlienta;
    }

    public String getDataKlienta() { return DataKlienta; }
    public void setDataKlienta(String DataKlienta) { this.DataKlienta = DataKlienta; }


    public String toString() {
        return "[\"" + getImie() + " " + getNazwisko() + "\" *: " + getDataKlienta() + ", employed: " + DataKlienta + "]";
    }

    public String getImie() {
        String imie = new String();

        return imie;
    }

    public String getNazwisko() {
        String nazwisko = new String();
        return nazwisko;
    }


}
