package com.yusuf.miniprojects;
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double length = 0;
        double width = 0;
        double area = 0;

        System.out.print("Enter the Length of the Rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the Width of the Rectangle: ");
        width = sc.nextDouble();
        area = length * width;
        System.out.println("Area of the Rectangle is: " + area + "cm");

        sc.close();
    }
}
