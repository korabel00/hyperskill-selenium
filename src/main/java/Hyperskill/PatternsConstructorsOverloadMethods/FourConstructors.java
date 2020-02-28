package Hyperskill.PatternsConstructorsOverloadMethods;

public class FourConstructors {
    int val = 50;
    String str = "default";

    public FourConstructors() {
        this(100);
    }

    public FourConstructors(int val) {
        System.out.println(val);
        //val = val;
        System.out.println(val);
    }

    public FourConstructors(String str) {
        this();
        System.out.println(this.val + " " + this.str);
        this.str = "some-value";
        System.out.println(this.val + " " + this.str);
    }

    public FourConstructors(int val, String str) {
        this(str);
    }

    public static void main(String[] args) {
        FourConstructors instance = new FourConstructors(120, "another-value");
    }
}
