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
                3.00,
                "Try our Hamburger, a signature flame-grilled. beef patty topped with a " +
                        "simple layer of crinkle cut pickles, yellow mustard, and ketchup on a " +
                        "toasted sesame seed bun." +
                        "\n\n" +
                        "It is 240 calories.",
                0));

        menu.put(2, new FoodItem(
                2,
                R.drawable.cheeseburger,
                "Cheeseburger",
                3.95,
                "You can’t go wrong with our cheeseburger, a signature flame-grilled " +
                        "beef patty topped with a simple layer of melted American cheese, crinkle " +
                        "cut pickles, yellow mustard, and ketchup on a toasted sesame seed bun." +
                        "\n\n" +
                        "It is 280 calories.",
                0));
        menu.put(3, new FoodItem(
                3,
                R.drawable.whopper,
                "Bopper",
                6.40,
                "Our BOPPER® Sandwich is a ¼ lb of savory flame-grilled beef topped " +
                        "with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, crunchy " +
                        "pickles, and sliced white onions on a soft sesame seed bun.\n" +
                        "\n" +
                        "Served with a small side of piping hot, thick cut French Fries or golden " +
                        "Onion Rings and a small fountain drink of your choice to make it a meal." +
                        "\n\n" +
                        "It is 660 calories.",
                0));
        menu.put(4, new FoodItem(
                4,
                R.drawable.whopper_jr,
                "Bopper Jr.",
                5.40,
                "Our BOPPER JR.® Sandwich features one savory flame-grilled beef patty " +
                        "topped with juicy tomatoes, fresh lettuce, creamy mayonnaise, ketchup, " +
                        "crunchy pickles, and sliced white onions on a soft sesame seed bun.\n" +
                        "\n" +
                        "Served with a small side of piping hot, thick cut french fries or golden " +
                        "onion rings and a small fountain drink of your choice to make it a meal." +
                        "\n\n" +
                        "It is 310 calories.",
                0));
        menu.put(5, new FoodItem(
                5,
                R.drawable.bacon_cheeseburger,
                "Bacon Cheeseburger",
                5.45,
                "You can’t go wrong with our Bacon Cheeseburger, a signature " +
                        "flame-grilled beef patty topped with smoked bacon and a layer of melted " +
                        "American cheese, crinkle cut pickles, yellow mustard, and ketchup on a " +
                        "toasted sesame seed bun." +
                        "\n\n" +
                        "It is 320 calories.",
                0));
        menu.put(6, new FoodItem(
                6,
                R.drawable.jalapeno_sandwich,
                "Jalapeno Sandwich",
                7.95,
                "You can’t go wrong with our Jalapeno sandwich. It has 2 signature flame-grilled " +
                        "beef patties topped with a simple layer of melted jack cheese, bacon," +
                        " spicy jalapenos, and creamy aioli on a toasted sesame seed bun." +
                        "\n\n" +
                        "It is 630 calories.",
                0));
        menu.put(7, new FoodItem(
                7,
                R.drawable.quarter_pounder,
                "Quarter Pounder",
                6.65,
                "Our Quarter Pound KING™ Sandwich has over ¼ lb. of flame-grilled 100% " +
                        "beef, topped with all of our classic favorites: American cheese, freshly " +
                        "sliced onions, zesty pickles, ketchup, & mustard all on a toasted sesame " +
                        "seed bun." +
                        "\n\n" +
                        "It is 580 calories.",
                0));
        menu.put(8, new FoodItem(
                8,
                R.drawable.grilled_chicken_sandwich,
                "Grilled Chicken Sandwich",
                7.45,
                "Our New Grilled Chicken Sandwich is made with seasoned 100% white meat " +
                        "chicken filet, flame-grilled to perfection, marinated with spices, layered " +
                        "with fresh lettuce, ripe tomato, and sweet honey mustard on a toasted " +
                        "potato bun." +
                        "\n\n" +
                        "It is 430 calories.",
                0));
        menu.put(9, new FoodItem(
                9,
                R.drawable.crispy_chicken_sandwich,
                "Crispy Chicken Sandwich",
                8.15,
                "Our New Crispy Sandwich is made with 100% white meat chicken filet, " +
                        "seasoned and breaded and carefully layered with fresh lettuce, ripe tomato," +
                        " and creamy mayonnaise on a potato bun." +
                        "\n\n" +
                        "It is 670 calories.",
                0));
        menu.put(10, new FoodItem(
                10,
                R.drawable.spicy_chicken_sandwich,
                "Spicy Chicken Sandwich",
                8.45,
                "Introducing the Spicy Crispy Chicken Sandwich made with juicy, tender " +
                        "and crispy 100% white meat chicken, seasoned and breaded with bold flavors " +
                        "and just the right amount of heat; topped with fresh lettuce, a ripe tomato, " +
                        "and creamy mayonnaise all on a potato bun." +
                        "\n\n" +
                        "It is 700 calories.",
                0));
        menu.put(11, new FoodItem(
                11,
                R.drawable.chicken_fries,
                "Chicken Fries",
                7.95,
                "Made with white meat chicken, our Chicken Fries are coated in a light " +
                        "crispy breading seasoned with savory spices and herbs. Chicken Fries are " +
                        "shaped like fries and are perfect to dip in any of our delicious dipping " +
                        "sauces. Choose from BBQ, Honey Mustard, Ranch, Zesty, Buffalo and " +
                        "Sweet & Sour." +
                        "\n\n" +
                        "They are 290 calories.",
                0));
        menu.put(12, new FoodItem(
                12,
                R.drawable.chicken_nuggets,
                "Chicken Nuggets",
                7.65,
                "Made with white meat, our bite-sized Chicken Nuggets are tender and " +
                        "juicy on the inside and crispy on the outside. Coated in a homestyle " +
                        "seasoned breading, they are perfect for dipping in any of our delicious " +
                        "dipping sauces." +
                        "\n\n" +
                        "They are 170 calories.",
                0));
        menu.put(13, new FoodItem(
                13,
                R.drawable.french_fries,
                "French Fries",
                2.75,
                "More delicious than ever, our signature piping hot, thick cut " +
                        "Salted French Fries are golden on the outside and fluffy on the inside." +
                        "\n\n" +
                        "They are 380 calories.",
                0));
        menu.put(14, new FoodItem(
                14,
                R.drawable.onion_rings,
                "Onion Rings",
                3.95,
                "Served hot and crispy, our golden Onion Rings are the perfect treat " +
                        "for plunging into one of our bold or classic sauces." +
                        "\n\n" +
                        "They are 150 calories.",
                0));
        menu.put(15, new FoodItem(
                15,
                R.drawable.vanilla_soft_serve,
                "Vanilla Soft Serve",
                1.50,
                "We didn’t invent soft serve, but with one taste of our cool, creamy, " +
                        "and velvety Vanilla Soft Serve, you’ll think we perfected it. Your choice " +
                        "of classic cone or cup." +
                        "\n\n" +
                        "It is 140 calories.",
                0));
    }

}
