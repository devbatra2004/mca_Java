// Write a program to show the difference between char and String data types.

public class CharVsString {

    public static void main(String[] args) {
        // char can store only one character
        char letter = 'A';

        // String can store a sequence of characters (word/sentence)
        String word = "Apple";

        System.out.println("Value of char: " + letter);
        System.out.println("Value of String: " + word);

        System.out.println("char represents a single character like: 'A' ");
        System.out.println("String represents a sequence of characters like: \"Apple\" ");
    }
}
