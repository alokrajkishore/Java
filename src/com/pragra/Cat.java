package com.pragra;

public class Cat extends Animal {
    private final int numOfLegs = 4;

    public int getNumOfLegs () {
        return numOfLegs;
    }

    public static void main(String[] args) {
        Cat newCat = new Cat();
        newCat.setColor("Black");
        System.out.println("Color is: "+ newCat.getColor());
        System.out.println("Num of legs is: "+ newCat.getNumOfLegs());
    }
}
