package com.yusuf.controlflow;
import java.util.Scanner;
public class Marks2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        double marks = sc.nextDouble();


        if(marks < 0 || marks > 100){
            System.out.println("Invalid Marks");
        }
        else if(marks>=90){
            System.out.println('A');
        }else if(marks>=80){
            System.out.println('B');
        }else if(marks >= 70){
            System.out.println('C');
        }else if(marks >= 60){
            System.out.println('D');
        }else{
            System.out.println('F');
        }
        sc.close();
    }
}
