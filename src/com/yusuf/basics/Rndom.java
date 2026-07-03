package com.yusuf.basics;
import java.util.Random;  // importing random class to access random methods.
public class Rndom {
    public static void main(String[] args) {

        Random random = new Random();
        int number;
        double fill;
        number = random.nextInt(1, 6);   // the bound number is exclusive.
        fill = random.nextDouble(1, 798);
        System.out.println(number);
        System.out.println(fill);
    }
}
