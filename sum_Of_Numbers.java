import java.util.Scanner;

public class sum_Of_Numbers {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int a = s1.nextInt();
        int b = s1.nextInt();

        int sum = a + b;

        System.out.println("The sum of a and b is: " + sum);
    }
}
