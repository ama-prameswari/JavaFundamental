package com.juaracoding;
import java.util.Scanner;

public class JavaArray {
    public static void main(String[] args) {
        // name= nama variabel; type= type data; length= jumlah/banyaknya data.

        // cara 1
        int[] angka = {1,2,3,4,5}; // index mulai dari 0 sampai 4
        System.out.println(angka[2]);

        System.out.println("-----------------------");

        // cara 2 = input dari user (scanner)
        int[] grades = new int[5];
        grades[0] = 80;
        grades[1] = 81;
        grades[2] = 82;
        grades[3] = 83;
        grades[4] = 84;
        grades[2] = 85; // overwritten array; menambahkan data sebelum dijalankan=hard code.
//        nilai[5] = 86; // index 5 out of bounds for length 5.
        System.out.println(grades[2]);
        System.out.println(grades.length);

        System.out.println("-----------------------");

        // looping array
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        System.out.println("-----------------------");

        // for each
        for (int grade : grades){
            System.out.println(grade);
        }

        System.out.println("-----------------------");

        // looping array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for(String car : cars){
            System.out.println(car.toUpperCase());
        }

        System.out.println("-----------------------");

        // array multidimensi = matriks
        int[][] angkaKu = {{1,2,3,4},{5,6,7}};
        System.out.println(angkaKu[1][2]); // baris;kolom.
        System.out.println("Jumlah baris = "+angkaKu.length);
        System.out.println("Jumlah kolom baris ke-1 = "+angkaKu[0].length);
        System.out.println("Jumlah kolom baris ke-2 = "+angkaKu[1].length);

        System.out.println("-----------------------");

        for (int i = 0; i < angkaKu.length; i++) {
            for (int j = 0; j < angkaKu[i].length; j++) {
                System.out.println(angkaKu[i][j]); // contoh: [0]=baris; [3]=kolom == 4.
            }
        }

        System.out.println("-----------------------");


        Scanner scanner = new Scanner(System.in);

        // Tentukan jumlah kota yang ingin diinput user(scanner) Challenge
//        String[] cities = new String[5];

        // Input data kota dari user
//        for (int i = 0; i < cities.length; i++) {
//            System.out.print("Masukkan nama kota ke-" + (i+1) + ": ");
//            cities[i] = scanner.nextLine();
//        }

        System.out.println("-----------------------");

        // Output data nama kota
        // for each
//        System.out.println("Daftar kota yang diinput: ");
//        for (String city : cities) {
//            System.out.println(city);
//        }
        System.out.println("-----------------------");


        // menjumlahkan list data harga tsb
        double[] prices = {10000,50000,70000,90000,100000};
        double sum = 0;

        for (int i = 0; i < prices.length; i++) {
            sum += prices[i]; // operator assignment
        }
        System.out.println("Jumlah bayar: " +sum);
        System.out.println("-----------------------");



        // mencari sebuah data
        String[] cities = {"Jakarta", "Bandung", "Surabaya", "Bali", "Makassar"};
        System.out.println("Masukan data yang ingin dicari= ");

        String search = scanner.next();
        boolean isFound = false;
        int index = 0;

        for (int i = 0; i < cities.length; i++) {
            if(search.equalsIgnoreCase(cities[i])){
                isFound = true;
                index = i;
            }
        }

        if (isFound) {
            System.out.println("Data ditemukan pada index ke-: " + index);  // data ditemukan
        } else{
            System.out.println("Data tidak ditemukan");  // data tidak ditemukan
        }

        // ubah menjadi ternary
        String text = isFound ? "Data ditemukan pada index ke-: " + index : "Data tidak ditemukan";
        System.out.println(text);

    }
}