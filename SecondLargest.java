
public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 89, 34, 56, 78, 90, 11};
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > first) {
                second = first;
                first = n;
            } else if (n > second && n != first) {
                second = n;
            }
        }
        System.out.println("Second Largest = " + second);
    }
}
