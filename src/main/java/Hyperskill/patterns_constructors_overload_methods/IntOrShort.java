package Hyperskill.patterns_constructors_overload_methods;

public class IntOrShort {
    public static void print(short a) {
        System.out.println("Short: " + a);
    }

    public static void print(int a) {
        System.out.println("Int arg: " + a);
    }

    public static void main(String[] args) {
        print(1);
    }
}
