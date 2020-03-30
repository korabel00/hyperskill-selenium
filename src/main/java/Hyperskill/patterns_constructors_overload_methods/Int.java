package Hyperskill.patterns_constructors_overload_methods;

public class Int {
    int val = 1;

    public Int() {
   //     val = val;
    }

    public Int(int val) {
        this();
    }


    public static void main(String[] args) {
        Int myInt = new Int(3);
        System.out.println(myInt.val);
    }
}
