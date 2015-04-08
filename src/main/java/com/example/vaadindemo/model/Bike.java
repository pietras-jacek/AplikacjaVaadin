package com.example.vaadindemo.model;

public class Bike {

    private String email;
    private String marka;
    private double cena;
    private double rozmiarRamy;
    private double rozmiarOpon;

    public Bike() {
        email = "brak danych";
        marka = "brak danych";
        cena = 0;
        rozmiarRamy = 0;
        rozmiarOpon = 0;
    }
    
    public Bike(String email, String marka, double cena, double rozmiarRamy, double rozmiarOpon) {
        this.email = email;
        this.marka = marka;
        this.cena = cena;
        this.rozmiarRamy = rozmiarRamy;
        this.rozmiarOpon = rozmiarOpon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public double getRozmiarRamy() {
        return rozmiarRamy;
    }

    public void setRozmiarRamy(double rozmiarRamy) {
        this.rozmiarRamy = rozmiarRamy;
    }

    public double getRozmiarOpon() {
        return rozmiarOpon;
    }

    public void setRozmiarOpon(double rozmiarOpon) {
        this.rozmiarOpon = rozmiarOpon;
    }

    @Override
    public String toString() {
        return "Bike{" + "Email Użytkownika=" + email + ", Marka=" + marka + ", Cena=" + cena + 
                ", Rozmiar Ramy=" + rozmiarRamy + ", Rozmiar Opon=" + rozmiarOpon + '}';
    }
}
