package Hyperskill.inteface;

interface Interface {

    int INT_CONSTANT = 0; // it's a constant, the same as public static final INT_FIELD = 0

    void instanceMethod1();

    void instanceMethod2();

    static void staticMethod() {
        System.out.println("Interface: static method");
    }

    default void defaultMethod() {
        System.out.println("Interface: default method. It can be overridden");
    }
}
class Class implements Interface {

    @Override
    public void instanceMethod1() {
        System.out.println("Class: instance method1");
    }

    @Override
    public void instanceMethod2() {
        System.out.println("Class: instance method2");
    }
}

class Run {
    public static void main(String[] args) {
        Interface instance = new Class();

        instance.instanceMethod1(); // it prints "Class: instance method1"
        instance.instanceMethod2(); // it prints "Class: instance method2"
        instance.defaultMethod();   // it prints "Interface: default method. It can be overridden"
    }
}
