// Write a program to swap two numbers using a third variable.

import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = s1.nextInt();

        System.out.print("Enter b: ");
        int b = s1.nextInt();

        int c;

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        c = a;
        a = b;
        b = c;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
