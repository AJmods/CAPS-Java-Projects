package com.company.Chapter3;

public class RetailItem {

    String description;
    int unitsOnHand;
    double price;

    public RetailItem(String description, int unitsOnHand, double price)
    {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    public String toString()
    {
        return description + ", Units on hand: " + unitsOnHand + ", $" + price;
    }
    public double getPrice() {
        return price;
    }

    public int getUnitsOnHand() {
        return unitsOnHand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUnitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }
}
