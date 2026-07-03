package com.yusuf.miniprojects;
import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("What Item would you like to buy: ");
        item = sc.nextLine();
        System.out.print("What is the price of each: ");
        price = sc.nextDouble();
        System.out.print("How many would you like: ");
        quantity = sc.nextInt();

        total = price * quantity;

        System.out.println("\nYou have brought " + quantity + " " + item +"/s");
        System.out.println("Your total is " + currency + total);


    }
}
