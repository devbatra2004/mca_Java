// Write a program to demonstrate the use of a static final variable (constant).

class staticvsFinal {

    static int count = 0;
    final int rollNumber;

    // constructor
    staticvsFinal(int roll) {
        rollNumber = roll;
        count++;
    }

    void display() {
        System.out.println("Roll Number = " + rollNumber);
        System.out.println("Total Students (using static) = " + count);
    }

    public static void main(String[] args) {
        staticvsFinal s1 = new staticvsFinal(101);
        staticvsFinal s2 = new staticvsFinal(102);

        s1.display();
        s2.display();
    }
}
