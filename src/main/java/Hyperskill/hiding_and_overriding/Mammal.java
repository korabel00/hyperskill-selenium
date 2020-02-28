package Hyperskill.hiding_and_overriding;

class Mammal {

    protected String sayHello() {
        return "ohlllalalalalalaoaoaoa";
    }
}

class Cat extends Mammal {

    @Override
    public String sayHello() {
        return "meow";
    }
}

class Human extends Mammal {

    @Override
    public String sayHello() {
        return "hello";
    }
}

class Run {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        System.out.println(mammal.sayHello()); // it prints "ohlllalalalalalaoaoaoa"

        Cat cat = new Cat();
        System.out.println(cat.sayHello()); // it prints "meow"

        Human human = new Human();
        System.out.println(human.sayHello()); // it prints "hello"
    }
}