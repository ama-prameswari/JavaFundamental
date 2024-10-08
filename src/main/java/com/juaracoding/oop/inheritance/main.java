package com.juaracoding.oop.inheritance;

public class main {
    public static void main(String[] args){
        // bisa menggunakan protected pada class Karyawan
        Manager manager = new Manager();
        manager.setName("John");
        System.out.println(manager.getName());
    }
}
