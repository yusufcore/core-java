package com.yusuf.controlflow;
import java.util.Scanner;
public class marks1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        double marks = sc.nextDouble();

        if(marks >= 40){
            System.out.println("Pass ");
        }else{
            System.out.println("Fail");
        }
    }
}
