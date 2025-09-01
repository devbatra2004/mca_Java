// Program to demonstrate implicit and explicit type casting

class TypeCasting {

    public static void main(String[] args) {

        // Implicit type casting 
        int num = 100;
        double d = num;
        System.out.println("Implicit Casting (int to double): " + d);

        // Explicit type casting (Narrowing)
        double x = 99.99;
        int y = (int) x;
        System.out.println("Explicit Casting (double to int): " + y);

    }
}
