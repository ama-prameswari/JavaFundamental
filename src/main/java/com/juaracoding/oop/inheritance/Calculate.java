package com.juaracoding.oop.inheritance;

public class Calculate {
    public static double calculateTax(double salary){
        if(salary > 7000){
            return salary * 0.15;
        }else{
            return salary * 0.0;
        }
    }
}
