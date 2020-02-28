package Hyperskill.strategy.auto;

public class RunClass {
    public static void main(String[] args) {
        Auto sedan = new Sedan(new NormalFillStrategy());
        Auto hybrid = new HybridAuto(new HybridFillStrategy());
        Auto f1car = new F1Car(new F1PitstopStrategy());


        sedan.fill();
        hybrid.fill();
        f1car.fill();
    }

}
