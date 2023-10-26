package org.example;

import java.util.Objects;
import java.util.Scanner;

public class HotDrinksVendingMachine extends VendingMachine{
    @Override
    public void getProduct(String name, int volume, int temperature) throws InterruptedException {

        System.out.println("Product start to create ");
        System.out.println("Your order is : " + name );
        System.out.println("Your order is ready");
    }

}
