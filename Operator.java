
import java.util.Scanner;

public class Operator {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = s1.nextInt();

        System.out.print("Enter b: ");
        int b = s1.nextInt();

        // 🔹 Arithmetic Operators
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 🔹 Relational Operators
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // 🔹 Logical Operators
        System.out.println("\n--- Logical Operators ---");
        System.out.println("(a > 0 && b > 0) : " + (a > 0 && b > 0));
        System.out.println("(a > 0 || b > 0) : " + (a > 0 || b > 0));
        System.out.println("!(a > b) : " + !(a > b));

        // 🔹 Assignment Operators
        System.out.println("\n--- Assignment Operators ---");
        int c = a;
        System.out.println("c = a : " + c);
        c += b;  // c = c + b
        System.out.println("c += b : " + c);
        c -= b;  // c = c - b
        System.out.println("c -= b : " + c);
        c *= b;  // c = c * b
        System.out.println("c *= b : " + c);
        c /= (b == 0 ? 1 : b);
        System.out.println("c /= b : " + c);

        // 🔹 Unary Operators
        System.out.println("\n--- Unary Operators ---");
        System.out.println("++a : " + (++a));
        System.out.println("--b : " + (--b));
        System.out.println("a++ : " + (a++));
        System.out.println("b-- : " + (b--));
        System.out.println("After post-increment a : " + a);
        System.out.println("After post-decrement b : " + b);

        s1.close();
    }
}
