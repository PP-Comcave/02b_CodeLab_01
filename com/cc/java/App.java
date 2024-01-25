package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Konto konto1 = new Konto();
        Konto konto2 = new Konto();
        Konto konto3 = new Konto();
        output("Konto1 enthält "+ konto1.getKontostand());
        output("Konto2 enthält "+ konto2.getKontostand());
        output("Konto3 enthält "+ konto3.getKontostand());

        konto1.multiplyBy(2);
        konto2.multiplyBy(3);
        konto3.multiplyBy(10);
        output("Konto1 enthält jetzt doppelt soviel heisst "+ konto1.getKontostand());
        output("Konto2 enthält jetzt 3mal soviel heisst "+ konto2.getKontostand());
        output("Konto3 enthält jetzt das 10fache heisst "+ konto3.getKontostand());
    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    } 

}