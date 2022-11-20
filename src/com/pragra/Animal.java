package com.pragra;

public class Animal {
    private String color;

    Animal () {
        System.out.println("Inside animal");
    }

    public final void setColor (String color) {
        this.color = color;
    }

    public String getColor () {
        return color;
    }
}
