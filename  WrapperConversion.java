// Write a program to use wrapper class methods to convert numbers to binary and hexadecimal.

class WrapperConversion {

    public static void main(String[] args) {
        int number = 20;

        String binary = Integer.toBinaryString(number);

        String hex = Integer.toHexString(number);

        System.out.println("Number: " + number);
        System.out.println("Binary: " + binary);
        System.out.println("Hexadecimal: " + hex);
    }
}
