package com.cc.java;

public class Konto {
    private int kontostand;
    Konto(){
        this.kontostand = 10000;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }
    public void multiplyBy(int multi) {
        this.kontostand = this.kontostand * multi;
    }
}
