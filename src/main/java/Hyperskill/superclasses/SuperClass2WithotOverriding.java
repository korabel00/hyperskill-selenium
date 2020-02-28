package Hyperskill.superclasses;

class SuperClass2 {

    public int a = 1;

    public void hello() {
        System.out.println("Hello, I'm a SuperClass");
    }
}

class SubClass2 {

    public int a = 2;// почему не предупреждает?

    public void hello() {
        System.out.println("Hello, I'm a SubClass");
    }
}

class Run3 {
    public static void main(String[] args) {
        SuperClass2 obj1 = new SuperClass2();
        SubClass2 obj2 = new SubClass2();
        System.out.println(obj1.a);;
        System.out.println(obj2.a);;
        obj1.hello();
        obj2.hello();
    }
}