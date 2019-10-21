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
                 R.drawable.onion_rings,
                "Hamburger",
                3.50,
                "I am a hamburger.",
                0));

        menu.put(2, new FoodItem(
                2,
                R.drawable.onion_rings,
                "Cheeseburger",
                3.99,
                "I am a cheeseburger.",
                0));
    }

}
