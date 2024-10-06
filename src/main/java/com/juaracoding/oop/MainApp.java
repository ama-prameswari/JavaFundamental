package com.juaracoding.oop;
import java.util.Date;

public class MainApp {
    public static void main(String[] args){
        Fruit apple = new Fruit();
        apple.grams = 2;
        apple.calsPerGram = 57;
        System.out.println(apple.totalCalories());
        System.out.println(apple);

        Fruit mango = new Fruit();
        mango.grams = 3;
        mango.calsPerGram = 56;
        System.out.println(mango.totalCalories());
        System.out.println(mango);


        Date date = new Date();
        System.out.println(date.getTime());


        Kotak kotakPertama = new Kotak(10);
        kotakPertama.draw();

        Kotak kotakKedua = new Kotak(5);
        kotakKedua.draw();


        // cara1 segitiga:
        Segitiga segitiga = new Segitiga(5, 5);
        segitiga.draw();

        // cara2 segitiga:
//        Segitiga segitiga = new Segitiga(5);
//        segitiga.draw();


        // car
        Car car = new Car("Pertalite");
        car.warna();
        car.mesin();
        System.out.println(car.getBahanBakar());
        System.out.println(car.getTahunPembuatan());


        // employee
        Employee employee = new Employee("Rachma", "IT", 8000, true);
        employee.displayInfoEmp();

    }
}
