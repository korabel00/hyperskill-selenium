package Hyperskill.PatternsConstructorsOverloadMethods;

abstract class Worker {
    public void goToWork() {
        System.out.println("= I'm going to work sadly =");
    }

    public void goHome() {
        System.out.println("= I'm going home happy =");
    }

    public abstract void workingProcess();

    public void work() {
        workingProcess();
        goToWork();
        goHome();
        endIt();
    }

    public void endIt() {
        System.out.println("= Ending =");
    }
}

class Programmer extends Worker {

    public void workingProcess() {
        System.out.println("Work as a programmer");
    }

    @Override
    public void endIt() {
        System.out.println("= Ending = 2");
    }
}

public class TemplateDemo {

    public static void main(String[] args) {
        Worker programmer = new Programmer();
        programmer.work();
    }
}
