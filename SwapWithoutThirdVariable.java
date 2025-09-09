// Write a program to swap two numbers without using a third variable

import java.util.*;

class SwapWithoutThirdVariable {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = s1.nextInt();
        System.out.println("Enter b : ");
        int b = s1.nextInt();
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
