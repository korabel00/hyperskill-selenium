package Hyperskill.factorymethod.burger_store;

class BurgerStore extends BurgerFactory {

    @Override
    Burger createBurger(String type) {
        switch (type) {
            case "Chinese Burger":
                return new ChineseBurger(type);/* write your code here */
            case "American Burger":
                return new AmericanBurger(type);/* write your code here */
            case "Russian Burger":
                return new RussianBurger(type);/* write your code here */
            default:
                return null;
        }
    }
}
