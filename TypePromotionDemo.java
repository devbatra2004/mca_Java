// Write a program to demonstrate type promotion in arithmetic operations.

public class TypePromotionDemo {

    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        char c = 'A';
        int i = 50;
        float f = 5.5f;
        double d = 20.5;

        int result1 = b + s + c;
        System.out.println("Result of byte + short + char (int): " + result1);

        float result2 = i + f;
        System.out.println("Result of int + float (float): " + result2);

        double result3 = f + d;
        System.out.println("Result of float + double (double): " + result3);

        int result4 = b + i;
        System.out.println("Result of byte + int (int): " + result4);
    }
}
