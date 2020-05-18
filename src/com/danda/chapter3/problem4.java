package com.danda.chapter3;

public class problem4 {

    public static void main(String[] args) {
        RetailItem retailItem1 = new RetailItem("Jacket", 12, 59.95);
        RetailItem retailItem2 = new RetailItem("Designer Jeans", 1240, 34.95);
        RetailItem retailItem3 = new RetailItem("Shirt", 20, 24.95);

        System.out.println(retailItem1.toString());
        System.out.println(retailItem2.toString());
        System.out.println(retailItem3.toString());
    }
}
