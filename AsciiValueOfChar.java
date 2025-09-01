//  Write a program to find the ASCII value of a character.

import java.util.*;

class AsciiValueOfChar {

    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        char a = s1.next().charAt(0);
        int ascii = (int) a;
        System.out.println("The ASCII value of '" + a + "' is: " + ascii);
    }
}
