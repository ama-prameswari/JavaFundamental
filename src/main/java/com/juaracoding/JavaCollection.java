package com.juaracoding;
import java.util.ArrayList;

public class JavaCollection {
    public static void main(String[] args){

        // collection(datanya dinamis) datanya tidak dibatasi, bisa diimplementasikan dengan CRUD

        // array list
        ArrayList<String> cars = new ArrayList<>(); // selain string, bisa dengan object
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        System.out.println(cars);
        System.out.println(cars.get(2));
        cars.set(2, "Toyota");
        cars.add(2, "Mitsubishi");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);

        // for i
        System.out.println(cars.size());
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        // for each
        System.out.println("--for each--");
        for(String car : cars){
            System.out.println(car.toUpperCase());
        }

    }
}
