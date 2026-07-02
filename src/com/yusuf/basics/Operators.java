package com.yusuf.basics;

public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 17;

        System.out.println("1. Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
        System.out.println();

        int x = 10;
        System.out.println("2. Assignment Operators");
        x += 5;
        System.out.println("+= : " + x);
        x -= 2;
        System.out.println("-= : " + x);
        x *= 3;
        System.out.println("*= : " + x);
        x /= 2;
        System.out.println("/= :" + x);
        x %= 4;
        System.out.println("%= : " + x);
        System.out.println();
        System.out.println("3. Relational (Comparison) Operators");   // returns ---> Boolean Output;
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();
        System.out.println("4. Logical Operators");
        boolean java = true;
        boolean dsa = false;
        System.out.println("&& : " + (java && dsa));
        System.out.println("|| : " + (java || dsa));
        System.out.println("!java : " + (!java));
        System.out.println();
        System.out.println("5. Unary Operators");
        int num = 5;
        System.out.println("+num = " + (+num));
        System.out.println("-num = " + (-num));
        System.out.println();
        System.out.println("6. Increment / Decrement Operators");
        int count = 10;
        System.out.println("Post Increment: " + count++);
        System.out.println("After Post Increment: " + count);
        System.out.println("Pre Increment: " + (++count));
        System.out.println("Post Decrement: " + count--);
        System.out.println("After Decrement: " + count);
        System.out.println("Pre Decrement: " + (--count));
        System.out.println();
        System.out.println("7. Ternary Operators");
        int age = 18;
        String result = (age >= 18) ? "Adult" : "Minor";
        System.out.println("Ternary Result: " + result);
        System.out.println();
        System.out.println("8. Bitwise Operators");
        int p = 5;  //0101
        int q = 3;  //0011
        System.out.println("& : " + (p & q));
        System.out.println("| : " + (p | q));
        System.out.println("^ : " + (p ^ q));
        System.out.println("~p : " + (~p));
        System.out.println();
        System.out.println("9. Shift Operators");
        System.out.println("Left Shift (5 << 1): " + (5 << 1));
        System.out.println("Right Shift (5 >> 1): " + (5 >> 1));
        System.out.println("Unsigned Right Shift (5 >>> 1): " + (5 >>> 1));

    }
}
