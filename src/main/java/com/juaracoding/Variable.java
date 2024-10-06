package com.juaracoding;

public class Variable {

    public static void main(String[] args) {

        // camelCase
        // snake_case
        // data type numeric

        // bilanganBulat
        byte countCart = 100; // maks=170
        short stock = 10000;
        int price = 1000000; // maks=2000000000
        long saldo = 3000000000L;

        // bilanganKoma
        float grade = 95.5f;
        double salary = 10000000.95;

        // char
        char accreditation = 'A';
        // char num = '5'; harus pakai cara khusus

        // boolean
        boolean isResult = false; // boolean=true or false

        // C:\MyTools\apache-maven-3.9.6
        String path = "C:\\MyTools\\apache-maven-3.9.6";
        System.out.println(path);

        String address = "Jakarta";
        address = "Bogor";
        System.out.println(address);

        //automatic casting
        short data1 = 456;
        double dataDouble = data1;
        System.out.println(dataDouble);

        char data2 = 'Z';
        long dataLong = data2;
        System.out.println(dataLong);

        //manual casting
        long data = 9223372036854775000l;
        int dataInt = (int) data;
        System.out.println(dataInt);


    }

}
