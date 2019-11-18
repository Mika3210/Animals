package com.company;

public class SmallDog extends Animals {
    public SmallDog (String type, double size, int year){
        super(type, size, year);
    }
    public void eat(){
        System.out.println("SmallDog eat meat");
    }
}
