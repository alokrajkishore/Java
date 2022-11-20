package com.pragra;

public class StringDemo {
    public static void main(String[] args) {
        // String : immutable, created in shared pool area, not thread safe
        // StringBuilder : Mutable, created in heap area, not thread safe
        // StringBuffer : similar as StringBuilder but thread safe
        StringBuilder sb1 = new StringBuilder("Test");
        StringBuilder sb2 = new StringBuilder("Test");
        System.out.println(sb1.equals(sb2));
    }
}