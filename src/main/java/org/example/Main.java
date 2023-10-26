package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        HotDrinkWithTemperature cappuccino = new HotDrinkWithTemperature
                ("Cappuccino", 250, 84);
        HotDrinkWithTemperature latte = new HotDrinkWithTemperature
                ("Latte", 250, 78);

        cappuccino.order(cappuccino);
        latte.order(latte);

        HotDrinksVendingMachine machine =new HotDrinksVendingMachine();
        machine.getProduct("Cappuccino", 250 , 84);
        machine.getProduct("Latte", 250, 78);
    }
}
