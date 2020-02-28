package Hyperskill.strategy.navigator;

public class Navigator {

    private Strategy strategy;

    public Navigator(Strategy strategy) {
        this.strategy = strategy;
    }

    void buildNavigation(int startPoint, int endPoint, boolean goRightNow) {
        strategy.buildNavigation(startPoint, endPoint, goRightNow);
    }
}
