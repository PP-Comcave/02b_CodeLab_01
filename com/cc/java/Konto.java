package com.cc.java;

public class Konto {
    private int kontostand;
    private final String name;

    public Konto(String name) {
        this.name = name;
        this.kontostand = 10000;

    }

    public int getKontostand() {
        return kontostand;
    }

    public void multiplyBy(int multi) {
        this.kontostand = this.kontostand * multi;
    }

    public String getName() {
        return name;
    }
}
