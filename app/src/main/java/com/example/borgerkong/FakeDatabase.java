package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {
    public static FoodItem getItemById(int articleID) {
        return menu.get(articleID);
    }

    /***
     * Return an ArrayList containing all the items in the menu.
     */
    public static ArrayList<FoodItem> getAllItems() {
        return new ArrayList<FoodItem>((List) Arrays.asList(menu.values().toArray()));
    }

    public static ArrayList<FoodItem> getItemsInOrder() {
        ArrayList<FoodItem> order = new ArrayList<>(), menu = getAllItems();
        for (FoodItem item: menu) {
            if (item.getNumInOrder() > 0) {
                order.add(item);
            }
        }
        return order;
    }

    public static double getTotalOrderPrice() {
        ArrayList<FoodItem> order = getItemsInOrder();
        double total = 0.0;
        for (FoodItem item: order) {
            total += (item.getNumericPrice() * item.getNumInOrder());
        }
        return total;
    }

    // You can ignore everything below this for now.
    private static final HashMap<Integer, FoodItem> menu = new HashMap<>();

    static {
        menu.put(1, new FoodItem(
                1,
                 R.drawable.hamburger,
                "Hamburger",
                3.50,
                "I am a hamburger.",
                0));

        menu.put(2, new FoodItem(
                2,
                R.drawable.cheeseburger,
                "Cheeseburger",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(3, new FoodItem(
                3,
                R.drawable.whopper,
                "Bopper",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(4, new FoodItem(
                4,
                R.drawable.whopper_jr,
                "Bopper Jr.",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(5, new FoodItem(
                5,
                R.drawable.bacon_cheeseburger,
                "Bacon Cheeseburger",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(6, new FoodItem(
                6,
                R.drawable.jalapeno_sandwich,
                "Jalapeno Sandwich",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(7, new FoodItem(
                7,
                R.drawable.quarter_pounder,
                "Quarter Pounder",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(8, new FoodItem(
                8,
                R.drawable.grilled_chicken_sandwich,
                "Grilled Chicken Sandwich",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(9, new FoodItem(
                9,
                R.drawable.crispy_chicken_sandwich,
                "Crispy Chicken Sandwich",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(10, new FoodItem(
                10,
                R.drawable.spicy_chicken_sandwich,
                "Spicy Chicken Sandwich",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(11, new FoodItem(
                11,
                R.drawable.chicken_fries,
                "Chicken Fries",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(12, new FoodItem(
                12,
                R.drawable.chicken_nuggets,
                "Chicken Nuggets",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(13, new FoodItem(
                13,
                R.drawable.french_fries,
                "French Fries",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(14, new FoodItem(
                14,
                R.drawable.onion_rings,
                "Onion Rings",
                3.99,
                "I am a cheeseburger.",
                0));
        menu.put(15, new FoodItem(
                15,
                R.drawable.vanilla_soft_serve,
                "Vanilla Soft Serve",
                3.99,
                "I am a cheeseburger.",
                0));
    }

}
