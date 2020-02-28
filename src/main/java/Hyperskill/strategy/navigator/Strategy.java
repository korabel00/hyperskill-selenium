package Hyperskill.strategy.navigator;

public interface Strategy {

    void buildNavigation (int startPoint, int endPoint, boolean goRightNow);

}

class BusStrategy implements Strategy {

    @Override
    public void buildNavigation(int startPoint, int endPoint, boolean goRightNow) {
        System.out.println("Navigation route for a bus from point " + startPoint + " to " + endPoint +
                " has been built! Do not waste all your money on it!");
        if (goRightNow) {
            System.out.println("And gogogo");
        }
        else {
            System.out.println("Nhaaa, just planning");
        }
    }
}

class CarStrategy implements Strategy {

    private String carmodel;

    public CarStrategy(String carmodel){
        this.carmodel = carmodel;
    }

    @Override
    public void buildNavigation(int startPoint, int endPoint, boolean goRightNow) {
        System.out.println("Navigation route for a car from point " + startPoint + " to " + endPoint +
                " has been built! Use it wisely");
        if (goRightNow) {
            System.out.println("And gogogo");
        }
        else {
            System.out.println("Nhaaa, just planning");
        }
    }
}

class BicycleStrategy implements Strategy {

    @Override
    public void buildNavigation(int startPoint, int endPoint, boolean goRightNow) {
        System.out.println("Navigation route for a bicycle " + startPoint + " to " + endPoint +
                " has been built! Be aware of cars!");
    }
}



