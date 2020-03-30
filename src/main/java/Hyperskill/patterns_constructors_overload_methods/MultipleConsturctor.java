package Hyperskill.patterns_constructors_overload_methods;

public class MultipleConsturctor {
    String name;
    String model;
    int lifetime;

    public MultipleConsturctor() {
        this.name = "Anonymous";
        this.model = "Unknown";
        System.out.println("The first constructor");
    }

    public MultipleConsturctor(String name, String model) {
        this();
      //  this(name, model, 2);
    }

    public MultipleConsturctor(String name, String model, int lifetime) {
        this.name = name;
        this.model = model;
        this.lifetime = lifetime;
        System.out.println("The third constructor");
    }

    public static void main(String[] args) {
        MultipleConsturctor con = new MultipleConsturctor("John", "robot");
    }
}
