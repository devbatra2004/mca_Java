// Write a program to check if a long value can be stored in a float variable and display the result.

class LongToFloatCheck {

    public static void main(String[] args) {
        long num = 9223372036854775807L;   // Maximum long value

        float f = (float) num;  // Convert long to float

        System.out.println("Original long value: " + num);
        System.out.println("After storing in float: " + f);

        if ((long) f == num) {
            System.out.println("The long value can be stored in float accurately.");
        } else {
            System.out.println("The long value cannot be stored in float accurately.");
        }
    }
}
