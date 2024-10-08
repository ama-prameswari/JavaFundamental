package com.juaracoding.oop;
import com.juaracoding.oop.encapsulation.User;
import com.juaracoding.oop.inheritance.Calculate;
import com.juaracoding.oop.polymorphism.Calculator;
import com.juaracoding.oop.polymorphism.BidangDatar;
import com.juaracoding.oop.polymorphism.Kotak;
import com.juaracoding.oop.inheritance.Manager;


public class MainAppOOP {
    public static void main(String[] args){
        // encapsulation-> getter setter
        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("p4ssw0rd");

        System.out.println(admin.getUsername());
        System.out.println(admin.getPassword());


        // polymorphism-> overloading ->lebih kuat dibagian parameter
        Calculator calculator = new Calculator();
        calculator.sum(10.5, 5.5);
        calculator.sum(10, 5);
        calculator.sum(10, 5, 3);

        // polymorphism -> overriding ->lebih kuat dibagian blok programnya
        // penggunaan polymorphism overriding dapat diimplementasikan sebagai konsep program payment dengan beragam cara pembayaran.
        BidangDatar bidangDatar = new BidangDatar();
        BidangDatar kotak = new Kotak(5);
        bidangDatar.draw();
        kotak.draw();


        // inheritance
        Manager manager = new Manager();
        manager.setName("John");
        manager.setAddress("Jakarta");
        manager.setSalary(10000);
        manager.setDepartment("IT");

        System.out.println(manager.getName());
        System.out.println(manager.getAddress());
        System.out.println(manager.getSalary());
        System.out.println(manager.getDepartment());

        // calculateTax()
        System.out.println(manager.calculateTax());
        System.out.println(Calculate.calculateTax(manager.getSalary()));

    }
}
