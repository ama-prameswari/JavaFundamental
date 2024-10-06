package com.juaracoding;

public class JavaMethod {
    public static void main(String[] args) {

        // reuseable
        drawKotak(5);
        drawKotak(10);

        // cara1:
        System.out.println(luasKotak(10));
        System.out.println(luasKotak(12));

        // cara2:
        double sisi = 10;
        double luas = luasKotak(sisi);
        System.out.println(luas);

        // cara1 String:
//        setName("Juara coding");

        // cara2 String:
//        System.out.println(setName("JuaraCoding"));
//
//        System.out.println(setText("Indonesia"));


        // login true
        System.out.println(login("admin", "p4ssw0rd"));
        // login false
        System.out.println(login("invalid", "invalid"));


        // tax
        calculateTax(7000, 'L');
        calculateTax(7000, 'P');
        calculateTax(6000, 'P');


        String[] cities = {"Jakarta", "Bandung", "Surabaya", "Kalimantan", "Bali", "Makassar"};
        cariKataTerpanjang(cities);


    }

    // static void= method bisa langsung dipanggil
    private static void drawKotak(int sisi) {  // parameter= gunakan parameter karena valuenya berbeda(sisi)
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static double luasKotak(double sisi) {
        return sisi * sisi;
    }

    // cara1 string:
//    static void setName(String name){
//        System.out.println(name);
//    }

    // cara2 String:
    static String setName(String name) {
        return name;
    }


    // modifier pada public or private
    // public= bisa dipanggil walaupun berbeda class maupun package, dapat diakses oleh seluruh kelas.
    // private= hanya bisa dipanggil dikelas java method yang sama, kalau dipanggil di beda kelas ataupun dibeda package, tidak bisa.
    // protected= subclass(turunan dari super class) masih bisa dipanggil
    // no modifier= ketika di package yg sama masih bisa diakses


    // Coder contains Code
    static boolean setText(String text) {
        return text.equals("Indo");
    }

//    static boolean setText(String text){
//        return text.contains("Indo");
//    }


    // fungsi login return boolean; login true(positive test) dan login false(negative test).


    // Fungsi login dengan operator ternary
    static boolean login(String username, String password) {
        // Menggunakan operator ternary untuk return boolean
        if (username.equals("admin") && password.equals("p4ssw0rd")) {
            return true;
        } else {
            return false;
        }
    }


    // calculateTax(salary, gender) berapa pajak yang harus dibayar
    // wajib pajak minimal salary 7000
    // gender L 10%, P 5%
    static void calculateTax(double salary, char gender) {
        if (salary >= 7000) { // jika kurang dari 7000, tidak ada pajak
            if (gender == 'L') {
                System.out.println(salary * 0.10); // Pajak 10% untuk laki-laki
            } else {
                System.out.println(salary * 0.05); // Pajak 5% untuk perempuan
            }
        } else {
                System.out.println(salary * 0.0); // Jika gender tidak valid
        }
    }


    // cari kata terpanjang: "Jakarta", "Bandung", "Surabaya", "Kalimantan", "Bali", "Makassar"
    static void cariKataTerpanjang(String[] cities){
        int kataTerpanjang = 0;
        int index = 0;
        for (int i = 0; i < cities.length; i++) {
            if(kataTerpanjang < cities[i].length()){ // loopingan 10 < 8
                kataTerpanjang = cities[i].length();
                index = i;
            }
        }
        System.out.println("Kata terpanjang berada pada index ke-"+index+" yaitu "+cities[index]);
    }


}