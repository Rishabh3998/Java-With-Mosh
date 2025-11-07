package com.codewithmosh;

import java.awt.*;
import java.util.Arrays;
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
        Point point2 = point1;
        System.out.println(point2); // java.awt.Point[x=1,y=1]

        point1.x = 2;
        System.out.println(point1); // java.awt.Point[x=2,y=1]
        System.out.println(point2); // java.awt.Point[x=2,y=1]

        // Strings (Reference type) [Immutable]
        System.out.println("Hello World"); // Printing a string
        String message = new String("Hello World"); // In Java, we have a shorthand for this
        String shortMessage = "Hello World"; // Will work same as above.

        System.out.println(message);
        System.out.println(shortMessage);

        // Concatenation in strings
        String msg = "Hello" + " World";
        System.out.println(msg);

        // Members of String class
        boolean endsWith = msg.endsWith("ld");
        System.out.println(endsWith); // true

        boolean startsWith = msg.startsWith("He");
        System.out.println(startsWith); // true

        System.out.println(msg.length()); // 11

        System.out.println(msg.indexOf("l")); // 2
        System.out.println(msg.indexOf("sky")); // -1

        // Replace method does not modify the original string, it creates a copy
        // edit and returns that copy
        // H and h are the args we are passing
        System.out.println(msg.replace('H', 'h'));
        System.out.println(msg);

        System.out.println(msg.toLowerCase());
        System.out.println(msg.toUpperCase());

        String whiteSpaces = "     Hello    ";
        System.out.println(whiteSpaces);
        System.out.println(whiteSpaces.trim());

        // Escape Sequences
        String escape = "Hello \"Mosh\"";
        System.out.println(escape);

        String path = "c:\\Windows\\..";
        System.out.println(path);

        // new line and tab
        String newLine = "Hello \nWorld";
        String tab = "Hello \tWorld";
        System.out.println(newLine);
        System.out.println(tab);

        // Arrays
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.println(numbers); // Address of the array
        System.out.println(Arrays.toString(numbers)); // Array [1,2,3,0,0]

        int[] newNumbers = {2,3,5,1,4};
        System.out.println(Arrays.toString(newNumbers));
        System.out.println(newNumbers.length);
        Arrays.sort(newNumbers);
        System.out.println(Arrays.toString(newNumbers));

        // Multi-dimensional Arrays

        // 2-D Arrays (new int[rows][columns])
        int [][] mat = new int[2][3];
        int [][] twoD = {{1,2,3}, {4,5,6}};
        mat[0][0] = 1;
        // To print multi-dimensional arrays, use deepToString
        System.out.println(Arrays.deepToString(mat)); // [[1, 0, 0], [0, 0, 0]]
        System.out.println(Arrays.deepToString(twoD)); // [[1, 2, 3], [4, 5, 6]]

        // 3-D Arrays
        int [][][] threeD = new int[2][2][5];
        threeD[0][0][0] = 1;
        System.out.println(Arrays.deepToString(threeD)); // [[[1, 0, 0, 0, 0], [0, 0, 0, 0, 0]], [[0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]]
    }
}
