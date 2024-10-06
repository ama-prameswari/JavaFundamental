package com.juaracoding;

public class Operator {

    public static void main(String[] args) {

        // aritmatik
        double result = 5/2; // example 5/2.5=2.5
        System.out.println(result);

        int modulus = 11 % 3;
        System.out.println(modulus);

        // increment
        int x = 2;
        int hasil = 10 * x++;
        System.out.println(hasil);

        int n = 2;
        int hasil1 = 10 * --n;
        System.out.println(hasil1);

        int total = 10+2*5;
        System.out.println(total);

        int total1 = (10+2)*5;
        System.out.println(total1);

        // assignment operator
        int a = 10;
        int b = 12;
        a += b;
        System.out.println(a);

        // relational operator
        boolean isResult = 4 > 4;
        System.out.println(isResult);

        boolean isResult1 = 4 >= 4;
        System.out.println(isResult1);

        //bitwise
        int bitwise = 10 | 12;
        //1010 = 10
        //1100 = 12

        //1000 = 8 and (&)
        //1110 = 14 or (|)
        System.out.println(bitwise);
    }

}
