// Write a program to demonstrate numeric overflow in Java.

public class NumericOverflow {

    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println("Maximum int value: " + max);

        int overflow = max + 1;
        System.out.println("After adding 1 (overflow): " + overflow);
    }
}
