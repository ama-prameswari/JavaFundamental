package com.juaracoding.oop;

public class Fruit {
    // state
    int grams;
    int calsPerGram;

    // behavior adalah istilah lain dari method
    int totalCalories(){
        return grams*calsPerGram;
    }

}