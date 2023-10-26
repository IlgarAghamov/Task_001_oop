package org.example;

public class HotDrinkWithTemperature extends HotDrink{
    private int temperature;

    public HotDrinkWithTemperature(int temperature) {
        this.temperature = temperature;
    }

    public HotDrinkWithTemperature(String name, int volume, int temperature) {
        super(name, volume);
        this.temperature=temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void order(HotDrink hotDrink) {
        System.out.println("Your order is  :" +
                hotDrink.name + " volume is :"+
                hotDrink.volume + " temperature is :" +
                this.temperature
        );
    }
}
