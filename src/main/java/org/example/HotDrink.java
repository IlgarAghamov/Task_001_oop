package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class HotDrink {
    String name ;
    int volume ;

    public HotDrink() {
    }

    public HotDrink(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void order (HotDrink hotDrink){
        System.out.println("Your order is  :" + hotDrink.name + " volume is :"+ hotDrink.volume);
    }
}