
public class MemoryDifference {

    public static void main(String[] args) {
        // Primitive variable (stores actual value)
        int a = 10;
        int b = a; // copy of value
        b = 20;

        System.out.println("Primitive Example:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Reference variable (stores address of object)
        int[] arr1 = {1, 2, 3};
        int[] arr2 = arr1;
        arr2[0] = 99;

        System.out.println("\nReference Example:");
        System.out.println("arr1[0] = " + arr1[0]);
        System.out.println("arr2[0] = " + arr2[0]);
    }
}
