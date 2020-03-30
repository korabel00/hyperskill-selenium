package Hyperskill.patterns_constructors_overload_methods;

// An example of thw way how to count a number of instances
public class CountObjects {
    // Статические интовые переменные по умолчанию равны нулю.
    private static int count;

    public CountObjects(){
        //Variable counts a number of instances created. Cool isn't it?
        count ++;
    }

    public static void main(String[] args) {
        CountObjects obj1 = new CountObjects();
        CountObjects obj2 = new CountObjects();
        CountObjects obj3 = new CountObjects();
        System.out.println(CountObjects.count);
    }
}
