package com.codewithmosh;

import java.awt.*;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // System is a class in which some members are defined which can be
        // used via dot operator
        System.out.println("Hello World");

        // Primitive types:

        // creating and initializing a variable
        // int age = 30;
        byte age = 30;
        // Re-assignment of a variable
        age = 35;
        // Copying a value of one variable into another
        // int myAge = 30;
        byte myAge = 30;
        // int herAge = myAge;
        byte herAge = myAge;

        int viewsCount = 123_456_789;
        long viewsCountLong = 3_123_456_789L;

        float price = 10.99F;

        char letter = 'A';

        boolean isEligible = true;

        System.out.println(age);
        System.out.println(herAge);

        // Reference types:

        // new keyword creates an instance of Date class, the name
        // of this instance is now
        Date now = new Date();
        // Now this instance can access all the methods present in Data class via
        // dot operator
        System.out.println(now); // Thu Nov 06 19:15:10 IST 2025
        System.out.println(now.getTime()); // 1762436710933

        // Independent nature of primitive types
        byte x = 1;
        byte y = x; // creates an independent copy of the value present in x
        // x and y both have different location, we just copied the value of x in y
        // but if we modify x, it will not affect y.
        x = 2;
        System.out.println(x); // 2
        System.out.println(y); // 1

        // Reference type nature
        Point point1 = new Point(1,1);
        System.out.println(point1); // java.awt.Point[x=1,y=1]
        Point point2 = new Point(point1);
        System.out.println(point2); // java.awt.Point[x=1,y=1]

        point1.x = 2;
        System.out.println(point1); // java.awt.Point[x=2,y=1]
        System.out.println(point2); // java.awt.Point[x=1,y=1]


    }
}
