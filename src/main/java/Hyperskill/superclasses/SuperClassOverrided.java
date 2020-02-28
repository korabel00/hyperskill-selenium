package Hyperskill.superclasses;

class SuperClass {

    public int a = 1;

    public void hello() {
        System.out.println("Hello, I'm a SuperClass");
    }
}

class SubClass extends SuperClass{

    public int a = 2;

    @Override
    public void hello() {
        System.out.println("Hello, I'm a SubClass");
    }
}

class Run2 {
    public static void main(String[] args) {
        SuperClass obj1 = new SuperClass();
        SuperClass obj2 = new SubClass();
        System.out.println(obj1.a);;
        System.out.println(obj2.a);;
        obj1.hello();
        obj2.hello();
    }
}
