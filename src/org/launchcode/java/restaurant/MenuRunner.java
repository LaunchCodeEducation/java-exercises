package org.launchcode.java.restaurant;

import static org.launchcode.java.restaurant.Category.APPETIZER;
import static org.launchcode.java.restaurant.Category.DESSERT;
import static org.launchcode.java.restaurant.Category.MAIN_COURSE;

public class MenuRunner {

    public static void main(String[] args) {
        Menu menu = new Menu();

        MenuItem carrots = new MenuItem();
        carrots.setCategory(APPETIZER)
                .setDescription("A soft orange vegetable")
                .setPrice(4.99);

        MenuItem steak = new MenuItem();
        steak.setCategory(MAIN_COURSE)
                .setDescription("Grilled ribeye - medium rare")
                .setPrice(18.99);

        MenuItem iceCream = new MenuItem();
        iceCream.setCategory(DESSERT)
                .setDescription("Cold and sweet chocolate flavor")
                .setPrice(2.99);

        System.out.println(menu.displaySimpleDate());
    }

}
