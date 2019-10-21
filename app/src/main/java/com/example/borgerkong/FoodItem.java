package com.example.borgerkong;

import java.nio.DoubleBuffer;

public class FoodItem {
    int itemId;
    int imageId;
    String itemName;
    double price;
    String description;
    int numInOrder;

    public FoodItem(int itemId, int imageId, String itemName, double price, String description, int numInOrder) {
        this.itemId = itemId;
        this.imageId = imageId;
        this.itemName = itemName;
        this.price = price;
        this.description = description;
        this.numInOrder = numInOrder;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemId() {
        return itemId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPriceS() {
        return "A$" + String.format("%.2f", price);
    }

    public double getNumericPrice() {
        return price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setNumInOrder(int numInOrder) {
        this.numInOrder = numInOrder;
    }

    public int getNumInOrder() {
        return numInOrder;
    }
}
