package Hyperskill.factorymethod.burger_store;

class TestDrive {
    public static void main(String[] args) throws InterruptedException {
        BurgerStore burgerStore = new BurgerStore();
        burgerStore.orderBurger("Chinese Burger");
        burgerStore.orderBurger("American Burger");
        burgerStore.orderBurger("Russian Burger");
        /* write your code here */
    }
}