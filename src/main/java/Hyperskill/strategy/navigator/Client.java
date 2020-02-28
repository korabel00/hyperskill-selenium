package Hyperskill.strategy.navigator;

public class Client {

    public static void main(String[] args) {
        Navigator busNavigator = new Navigator(new BusStrategy());
        busNavigator.buildNavigation(2,2, true);
        busNavigator.buildNavigation(6,6, false);

        Navigator carNavigator = new Navigator(new CarStrategy("Nissan"));
        carNavigator.buildNavigation(7,7, true);

        Navigator bicycleNavigator = new Navigator(new BicycleStrategy());
        bicycleNavigator.buildNavigation(1333,44, false);
    }
}
