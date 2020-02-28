package Hyperskill.PatternsConstructorsOverloadMethods;

/*1. Implement a class named PatternsConstructorsOverloadedMethods.Cat with two instance fields: string name and int age, and one static int field counter.
The static counter field allows you to known how many cats have been already created.
The class should have a constructor for initializing the instance fields. During the initialization of a new cat,
the value of the static field counter should be incremented. If the counter > 5, the message
"You have too many cats" must be printed out in the System.out.
2. You also need to implement a static method getNumberOfCats.
It should return the current number of created cats and print no messages.
Example. Let's assume seven instances of the class PatternsConstructorsOverloadedMethods.Cat have already been created. Then the correctly implemented method
PatternsConstructorsOverloadedMethods.Cat.getNumberOfCats() should return 7. The message "You have too many cats" has to appear twice.*/
class Cat {
    // write static and instance variables
    String name;
    int age;
    static int counter = 0;

    public Cat(String name, int age) {
        // implement the constructor
        // do not forget to check the number of cats
        this.name = name;
        this.age = age;
        counter ++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
    }

    public static int getNumberOfCats() {
        // implement the static method
        return counter;
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat("John", 2);
        Cat cat2 = new Cat("John", 4);
        Cat cat3 = new Cat("John", 4);
        Cat cat4 = new Cat("Jack", 4);
        Cat cat5 = new Cat("1ack", 4);
        Cat cat6 = new Cat("1ack", 4);
        Cat cat7 = new Cat("2ack", 5);
        System.out.println(Cat.getNumberOfCats());
    }
}
