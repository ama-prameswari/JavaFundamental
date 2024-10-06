package com.juaracoding;
import java.util.Random;
import java.util.Scanner;

public class Percabangan {
    public static void main(String[] args) {

        // if tunggal
        if (true) {    // (false) = "Next Statement"
            System.out.println("Statement");

        }
        System.out.println("Next Statement");

        // if else
        int suhu = 36;
        if (suhu <= 36) {
            System.out.println("Cuaca Normal");
        } else {
            System.out.println("Cuaca Sangat Panas");
        }

        int suhu1 = 37;
        if (suhu1 > 36) {
            System.out.println("Cuaca Sangat Panas");
        } else {
            System.out.println("Cuaca Normal");
        }

        // ganjilGenap
        int angka = 5;
        if (angka % 2 == 0) {
            System.out.println(angka + " Bilangan Genap");
        } else {
            System.out.println(angka + " Bilangan Ganjil");
        }


        // if majemuk (challenge)
        String size;
        String qty;
        int price;

        System.out.print("Enter the size of the shirt (S, M, L): ");
        qty = "2";
        size = "L"; // default size is S

        if (size == "S" || size == "s") {
            price = 50000;
        } else if (size == "M" || size == "m") {
            price = 60000;
        } else if (size == "L" || size == "l") {
            price = 70000;
        } else {
            System.out.println("Invalid size. Please enter S, M, or L.");
            return;
        }

        System.out.println("The price of the shirt is Rp " + price);
        System.out.println("Size: " + size.toUpperCase() + " Price: " + price);


        // if majemuk (challenge)
        // username = admin; password = p4ssw0rd
        String inputUsername = "admin";
        String inputPassword = "p4ssw0rd";

        if (inputUsername.equals("admin") && inputPassword.equals("p4ssw0rd")) {
            System.out.println("Login berhasil");
        } else {
            System.out.println("Login gagal!");
        }

        // if majemuk (challenge)
        int platNomor = 1281;
        int date = 12;

        if ((platNomor % 2 == 0 && date % 2 == 0) || (platNomor % 2 == 1 && date % 2 == 1)) {
            System.out.println("bisa melewati jalan Soekarno Hatta");
        } else {
            if (platNomor % 2 == 1 && date % 2 == 0) {
                System.out.println("bisa melewati jalan Soekarno Hatta, karena plat nomor ganjil, tanggal genap");
            } else if (platNomor % 2 == 0 && date % 2 == 1) {
                System.out.println("bisa melewati jalan Soekarno Hatta, karena plat nomor genap, tanggal ganjil");
            } else {
                System.out.println("tidak bisa melewati jalan Soekarno Hatta");
            }
        }

        // nested if
        // (merupakan salah satu business logic)
        // totalAmount > 500000(has discount); totalAmount < 500000(hasnot discount)


        // Switch case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih Menu [1-5]: ");
        int chooseMenu = scanner.nextInt();
        switch(chooseMenu) {
            case 1:
                System.out.println("Menu ke-1");
                break;
            case 2:
                System.out.println("Menu ke-2");
                break;
            case 3:
                System.out.println("Menu ke-3");
                break;
            case 4:
                System.out.println("Menu ke-4");
                break;
            default:
                System.out.println("Menu tidak terdaftar");
                break;
        }

        // ternary
        System.out.println("Masukan niali: ");
        int nilai = scanner.nextInt();
        String keterangan = nilai >= 75 ? "Lulus" : "Tidak Lulus";
        System.out.println(keterangan);


    }
}
