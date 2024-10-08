package com.juaracoding.oop.inheritance;

public class Karyawan {
    private String name;
    private String address;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double calculateTax(){
        if(salary > 7000){
            return salary * 0.15;
        }else{
            return salary * 0.0;
        }
    }
}
