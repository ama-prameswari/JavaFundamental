package com.juaracoding.oop;

public class Segitiga {
    int alas;
    int tinggi;

    // constructor
    Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public void draw() {
        for (int i = 0; i < this.tinggi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
