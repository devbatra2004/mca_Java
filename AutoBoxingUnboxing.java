// Program to demonstrate Autoboxing and Unboxing

public class AutoBoxingUnboxing {

    public static void main(String[] args) {
        // Autoboxing: converting primitive into object
        int a = 100;
        Integer obj = a;
        System.out.println("Autoboxing (int -> Integer): " + obj);

        // Unboxing: converting object into primitive
        Integer b = 200;
        int num = b;
        System.out.println("Unboxing (Integer -> int): " + num);
    }
}
