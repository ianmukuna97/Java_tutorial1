package org.example;

public class tutorial_4 {
    public static void main(String[] args) {
        int length = 5;
        int width = 4;
        int area;

        //Area of a rectangle
        area = length * width;

        //Print variables
        System.out.println("Length is: " + length);
        System.out.println("Width is: " + width);
        System.out.println("Area of a rectangle is: " + area);

        byte myNum = 127;
        System.out.println(myNum);

        // Create variables of different data types
        int items = 50;
        float costPerItem = 9.99f;
        float totalCost = items * costPerItem;
        char currency = '$';

        // Print variables
        System.out.println("Number of items: " + items);
        System.out.println("Cost per item: " + costPerItem + currency);
        System.out.println("Total cost = " + totalCost + currency);
    }
}
