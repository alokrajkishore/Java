package com.pragra;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double circumference () {
        return 2 * Math.PI * radius;
    }

    public double area () {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle newCircle1 = new Circle(12);
        Circle newCircle2 = new Circle(10);
        System.out.println(newCircle1.circumference());
        System.out.println(newCircle2.circumference());
    }
};
