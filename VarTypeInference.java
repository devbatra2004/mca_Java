// Write a program to use var (Java 10+) for type inference.

public class VarTypeInference {

    public static void main(String[] args) {

        var number = 10;
        var name = "Dev Batra";
        var price = 99.99;
        var isJavaFun = true;

        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Is Java Fun? " + isJavaFun);

        for (var i = 1; i <= 5; i++) {
            System.out.println("Square of " + i + " = " + (i * i));
        }
    }
}
