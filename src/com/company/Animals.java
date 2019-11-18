package com.company;

public class Animals {
    private String type;
    private double size;
    private int year;

    Animals(String t, double s, int y) {
        this.type = t;
        this.size = s;
        this.year = y;
    }

    public void eat() {
        System.out.println("All animals eat");
    }

    public void sleep() {
        System.out.println("All animals sleep");
    }

    public void setType(String t) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSize(double s) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setYear(int y) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}