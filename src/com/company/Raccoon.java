package com.company;

public class Raccoon extends Animals {
    private String name;
    public Raccoon (String type, double size, int year, String n){
        super(type, size, year);
        this.name = n;
    }
    public void eat(){
        System.out.println("Raccoon eat small");
    }
    public void sleep() {
        System.out.println("Raccoon sleep at night");
    }
}
