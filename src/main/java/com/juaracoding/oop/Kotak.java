package com.juaracoding.oop;

public class Kotak {
    int sisi;

    // constructor
    Kotak(int sisi) {
        this.sisi = sisi;
    }

    void draw(){
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.println("*");
            }
            System.out.println();
        }
    }
}
