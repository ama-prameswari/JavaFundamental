package com.juaracoding;

public class ExceptionHandling {
    public static void main(String[] args){

        try {
            int result = 100/0;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace(); // menampilkan exception pada baris ke-7
//            System.err.println("Tidak bisa dibagi 1"); // contoh hasil modifikasi
        }

        System.out.println("Next statement");

    }
}
