
import java.util.Scanner;

public class StopAtSpace {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (char ch : s.toCharArray()) {
            if (ch == ' ') {
                break;
            }
            System.out.print(ch);
        }
    }
}
