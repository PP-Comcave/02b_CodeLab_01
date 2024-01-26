package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Konto[] kontos = { new Konto("Jasper"), new Konto("Peter"), new Konto("Benjamin") };

        output_konto_stand(kontos);

        kontos[0].multiplyBy(2);
        kontos[1].multiplyBy(3);
        kontos[2].multiplyBy(10);

        output_konto_stand(kontos);

    }


    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

    private static void output_konto_stand(Konto[] konto){
        for (int x = 0;  konto.length != x;  x++) {
            output("Konto von " + konto[x].getName() + " enthält " + konto[x].getKontostand());
        }
    }


}