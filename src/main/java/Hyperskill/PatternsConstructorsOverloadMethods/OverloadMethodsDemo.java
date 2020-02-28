package Hyperskill.PatternsConstructorsOverloadMethods;

//An example of overloaded and overrided method
public class OverloadMethodsDemo {
    public static void main(String[] args) {
        OverloadMethodsDemo overload = new OverloadMethodsDemo();
        overload.print("some string");
        print("another string", 2);
        print(5);
        OverloadMethodsDemo print2 = new OverrideClass();
        print2.print("overriding2");
    }

    public void print(String stringToPrint) {
        System.out.println(stringToPrint);
    }
    //Overload
    public static void print(String stringToPrint, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(stringToPrint);
        }
    }
    //Overload
    public static void print(int val) {
        System.out.println(val);
    }

}
class OverrideClass extends OverloadMethodsDemo{
   //Override
    @Override
    public void print(String stringToPrint) {
        System.out.println("There is a string to print:");
        System.out.println(stringToPrint);
    }
}