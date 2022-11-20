package com.pragra.day2;

import java.util.Date;

public class Demo {
    public static void main(String... data) {
        String[] days = new String[6];
        for (int i = 0; i < days.length; i++) {
            System.out.println(i);
        }
    }

    public String convert(Integer value) {
        return value.toString();
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