package com.juaracoding;
import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {

        // for = perulangan sebanyak misal 10x setelah itu berhenti atau dibatasi.
        for (int i = 0; i < 5; i++) { // 5 < 5 (false); i++ karena suffix maka, looping dimulai dari 0.
            System.out.println(i);
        }
        System.out.println("Next statement");
        System.out.println("================");

        // cara1: looping angka ganjil = 1 3 5 7 9
        for (int i = 1; i < 10; i++) { // 10 < 10 (false)
            if(i % 2 == 1) {           // 2 % 2 = 0 == 1 (false)
                System.out.println(i + " ");
            }
        }
        System.out.println("================");

        // cara2: looping angka ganjil = 1 3 5 7 9 (menggunakan assignment operator)
        for (int i = 1; i < 10; i+=2) { // i = 1 + 2 -> i = 3 + 2 -> dst
            System.out.println(i);
        }
        System.out.println("================");

        // cara3: looping angka ganjil = 1 3 5 7 9
        for (int i = 1; i < 10; i++) {
            System.out.println(i + " ");
            i++; //
        }
        System.out.println("================");

        // cara4(decrement): looping angka ganjil = 9 7 5 3 1

        // nested for
        // cara 1:
        int sisi = 5;
        for (int i = 0; i < sisi; i++) { // i = 0
            for (int j = 0; j < sisi; j++) { // 10 < 10
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");

        // cara 2:
        for (int i = 0; i < 5; i++) { // menunggu for j selesai, setelah itu dilanjut dengan for i.
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");

        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");

        // bintang segitiga
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");

        // bintang segitiga terbalik
        for (int i = sisi; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");

        // cara 2 bintang segitiga terbalik
        for (int i = sisi; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("================");


        // while = perulangan dibatasi maupun tidak dibatas, namun cenderung tidak terbatas.
        int x = 0; // cek kondisi, lalu lakukan
        while (x < 0) {
            System.out.print(x);
            x++;
        }
        System.out.println();
        System.out.println("Next statement");
        System.out.println("================");

        // do while (melakukan dahulu, lalu lakukan)
        int y = 0;
        do{
            System.out.print(y);
            y++;
        } while(y < 0);
        System.out.println();
        System.out.println("================");


        // break(benar-benar berhenti)
        while (x < 6) {
            System.out.println("Looping ke-"+x);
            if(x == 3) break;
            x++;
        }

        // continue(berhenti sejenak, lalu lanjut)
//        while (x < 6) {
//            if(x == 3){
//                x++;
//                continue;
//            }
//            System.out.println("Looping ke-"+x);
//            x++;
//        }

        // input angka berapapun, namun ketika input angka 0; keluar looping
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Input angka= ");

            int angka = scanner.nextInt();
            System.out.println("Kamu input= "+ angka);

            if (angka == 0) {
                break;
            }

        }
        System.out.println("Stop!");
    }
}