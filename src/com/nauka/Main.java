package com.nauka;

public class Main {
    public static void main(String[] args) {

        Osoba danBrown = new Osoba("Dan", "Brown", "22.06.1964");
        Osoba adamMickiewicz = new Osoba("Adam", "Mickiewicz", "24.12.1798");

        Biblioteka.addKsiazka("Pan Tadeusz", adamMickiewicz);
        Biblioteka.addKsiazka("The Lost Symbol", danBrown);
        Biblioteka.addKsiazka("The Da Vinci Code", danBrown);

        System.out.println("Books: " + Biblioteka.getKsiazka());

        Osoba janeDoe = new Osoba("Jane", "Doe", "02.02.2000");
        Osoba jackBlack = new Osoba("Jack", "Black", "01.01.2001");

        Biblioteka.addCzytelnik(new Osoba("John", "Smith", "01.01.2000"));
        Biblioteka.addCzytelnik(janeDoe);
        Biblioteka.addCzytelnik(jackBlack);

        System.out.println("Readers: " + Biblioteka.getCzytelnik());

        Biblioteka.addBibliotekarz(janeDoe, "01.01.2010");
        Biblioteka.addBibliotekarz(jackBlack, "09.09.2015");

        System.out.println("Librarians: " + Biblioteka.getKsiazka());

        Biblioteka.getCzytelnik().get(0).borrowBook(Biblioteka.getKsiazka().get(0));
        Biblioteka.getCzytelnik().get(1).borrowBook(Biblioteka.getKsiazka().get(0));
        Biblioteka.getCzytelnik().get(2).borrowBook(Biblioteka.getKsiazka().get(1));
        Biblioteka.getCzytelnik().get(2).borrowBook(Biblioteka.getKsiazka().get(2));
        Biblioteka.getCzytelnik().get(2).borrowBook(Biblioteka.getKsiazka().get(2));

        System.out.println("Borrowed by: " + Biblioteka.getCzytelnik().get(2) + ": " + Biblioteka.getCzytelnik().get(2).getPozyczone());

        Biblioteka.getCzytelnik().get(0).returnBook(Biblioteka.getKsiazka().get(2));
        Biblioteka.getCzytelnik().get(2).returnBook(Biblioteka.getKsiazka().get(2));
        Biblioteka.getCzytelnik().get(2).returnBook(Biblioteka.getKsiazka().get(2));
        Biblioteka.getCzytelnik().get(0).returnBook(Biblioteka.getKsiazka() .get(0));
    }
}
