// Write a program to check whether a number is positive, negative, or zero.

import java.util.*;

class CheckNumber {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s1.nextInt();

        if (num > 0) {
            System.out.println(num + " is Positive");
        } else if (num < 0) {
            System.out.println(num + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }
    }
}
