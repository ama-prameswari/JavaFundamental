package com.juaracoding.oop.polymorphism;

public class Calculator {

    // method overloading
    public void sum(int a,int b){
        System.out.println(a+b);
    }

    public void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }

    public void sum(double a,double b){
        System.out.println(a+b);
    }

}
