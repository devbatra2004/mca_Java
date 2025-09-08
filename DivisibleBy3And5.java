
import java.util.Scanner;

public class DivisibleBy3And5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = (n % 3 == 0 && n % 5 == 0) ? "Yes" : "No";
        System.out.println(res);
    }
}
