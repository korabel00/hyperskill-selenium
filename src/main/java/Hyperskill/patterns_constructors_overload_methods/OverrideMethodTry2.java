package Hyperskill.patterns_constructors_overload_methods;

public class OverrideMethodTry2 {
    public static void main(String[] args) {
        //PatternsConstructorsOverloadedMethods.Cat animal = new PatternsConstructorsOverloadedMethods.Cat();
        Kitten.kmToMiles(2);
    }
}
class Animal {
    public static void kmToMiles(int km) {
        System.out.println("Внутри родительского класса/статического метода");
    }
}

class Kitten extends Animal {

}