package Hyperskill.strategy.auto;

abstract public class Auto {

    private final FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void fill() {
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println("Gas");
    }

    public void stop() {
        System.out.println("Stop");
    }

/*    public FillStrategy getFillStrategy() {
        return this.fillStrategy;
    }*/
}