package com.yusuf.basics;
import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();

        System.out.print("Enter your Age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter your City: ");
        String city = sc.nextLine();

        System.out.print("Are you learning Java Backend? (true/false): ");
        boolean backend = sc.nextBoolean();

        System.out.println("\n========== STUDENT DETAILS ==========");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("City: " + city);
        System.out.println("Java Backend: " + backend);

        sc.close();
    }
}
