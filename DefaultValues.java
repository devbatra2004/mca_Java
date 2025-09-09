//  Write a program to print default values of instance variables in a class

class DefaultValues {

    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;
    String str;

    public void display() {
        System.out.println("Default values of instance variables:");
        System.out.println("byte    : " + b);
        System.out.println("short   : " + s);
        System.out.println("int     : " + i);
        System.out.println("long    : " + l);
        System.out.println("float   : " + f);
        System.out.println("double  : " + d);
        System.out.println("char    : '" + c + "'");
        System.out.println("boolean : " + bool);
        System.out.println("String  : " + str);
    }

    public static void main(String[] args) {
        DefaultValues obj = new DefaultValues();
        obj.display();
    }
}
