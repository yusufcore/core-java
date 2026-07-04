package com.yusuf.miniprojects;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        float num1 = sc.nextFloat();
        System.out.print("Enter the Second Number: ");
        float num2 = sc.nextFloat();
        System.out.print("Enter your Operation Choice: ");
        int ch = sc.nextInt();

        switch(ch){
            case 1:
                System.out.println("Sum of the Two Numbers is: " + num1+num2);
                break;
            case 2:
                System.out.println("Difference between the Two Numbers is: " + (num1-num2));
                break;
            case 3:
                System.out.println("Multiplication of the Two Numbers is: " + num1 * num2);
                break;
            case 4:
                System.out.println("Division of the Two Numbers is: " + num1 / num2);
                break;

            default:
                System.out.println("Have a nice day!");
        }

    }
}
