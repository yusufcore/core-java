package com.yusuf.basics;

public class TypeCasting {
    public static void main(String[] args) {

        int num = 10;
        double price = 99.999;
        char letter = 'a';

        double value = num;   // Implicit Casting ---> Automatic;
        System.out.println(value);

        int amount = (int) price;   // Explicit Casting ----> Manual;
        System.out.println(amount);

//        int ascii = letter;    // Implicit Way
        int ascii = (int) letter;  // Explicit way
        System.out.println(ascii);





    }
}
