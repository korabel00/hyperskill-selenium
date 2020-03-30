package Hyperskill.patterns_constructors_overload_methods;

public class SuperClass2 {
    protected int n = 10;
    protected String s = "abc";
    protected char ch = 'q';

    public SuperClass2(int n) {
        this.n = n;
    }
}

class BClass extends SuperClass2 {

    protected int n = 20;
    protected String s = "str";
    protected char ch = 'z';

    public BClass(int n, String s, char ch) {
        super(n);
        this.s = s;
        super.ch = ch;
    }

    public void print() {
        System.out.println(super.n + " " + super.s + " " + ch);
    }
}

class Run {
    public static void main(String[] args) {
        BClass b = new BClass(100, "txt", 'k');
        b.print();
    }
}
