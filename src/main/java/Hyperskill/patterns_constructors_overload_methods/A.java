/*Here's a class hierarchy containing three classes A, B and C.
What value does the following code print?
C c = new C(2);
c.printField();

* */

package Hyperskill.patterns_constructors_overload_methods;

class A {

    protected int field;

    public A(int val) {
        this.field = val + 1;
    }
}

class B extends A {

    protected int field;

    public B(int val) {
        super(val);
        this.field = super.field * 2;
    }
}

class C extends B {

    protected int field;

    public C(int val) {
        super(val);
        this.field = super.field + 2;
    }

    public void printField() {
        System.out.println(super.field);
    }

    public static void main(String[] args) {
        C c = new C(2);
        c.printField();
    }
}