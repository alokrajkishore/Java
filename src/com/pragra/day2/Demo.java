package com.pragra.day2;

import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date x = new Date();
        int a = 5;
        int b= 10;
        int sum = sum(5, 20);
        System.out.println("the sum is: "+ sum);
        findEven();
    }

    private void test () {
        System.out.println("Hello world");
    }

    public static int sum (int a, int b) {
        return a + b;
    }

    public static void findEven () {
        int i = 0;
        for (int j = 1; i < 10; j++) {
            if (j%2 == 0) {
                System.out.println(j);
                i++;
            }
        }
    }
};