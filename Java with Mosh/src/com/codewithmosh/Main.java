package com.codewithmosh;

import java.awt.*;
import java.text.NumberFormat;
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

        // Constants
        final float pi = 3.14F;

        // Arithmetic operations
        int result = 10 + 2; // 2
        System.out.println(result);

        int div = 10 / 3;
        System.out.println(div); // 3
        // Note: The answer is 3 because division of 2 whole numbers is a whole number.

        // To fix the above typecast the variables result
        double division = (double)10 / (double)3; // 3.333333....
        System.out.println(division);

        // Increment and Decrement operator
        int incPre = 1;
        int incPost = 1;

        ++incPre;
        incPost++;
        System.out.println(incPre); // 2
        System.out.println(incPost); // 2

        int decPre = 2;
        int decPost = 2;

        --decPre;
        decPost--;
        System.out.println(decPre); // 1
        System.out.println(decPost); // 1

        int v1 = 1;
        // First v1 will get copied to v2, then v1 will increase
        int v2 = v1++;

        int x1 = 1;
        // First x1 will increase then will get copied to x2
        int x2 = ++x1;

        System.out.println(x1); // 2
        System.out.println(v2); // 1

        int xby2 = 1;
        xby2 = xby2 + 2;
        xby2 += 2;
        xby2 -= 2;
        xby2 /= 2;
        xby2 *= 2;

        short sht  = 1;
        int integer = sht + 2;

        // Above we are adding short type in integer type
        // What should be the result

        // Short has 2 byte, int has 4 byte i.e. short can be stored in an integer, therefore
        // when Java sees the value of short it will automatically typecast it and store in int.
        // This is called as implicit casting
        // byte < short < int < long < float < double
        System.out.println(integer); // 3

        double decimalValue = 1.1;
        double doubleValueAdd = decimalValue + 2;
        // double + integer (int is less precise than double, automatically cast to double i.e. 2.0 )
        System.out.println(doubleValueAdd); // 3.1

        // Explicit typecasting
        double toBeCast = 1.1;
        int expCast = (int)toBeCast + 2;
        System.out.println(expCast); // 3

        String str = "1";
        int res1 = Integer.parseInt(str) + 2;
        System.out.println(str); // 1
        short res2 = (short) (Short.parseShort(str) + 1);
        System.out.println(str); // 1
        float res3 = Float.parseFloat(str) + 1;
        System.out.println(str); // 1
        double res4 = Double.parseDouble(str) + 4;

        System.out.println(str); // 1
        System.out.println(res1); // 3
        System.out.println(res2); // 2
        System.out.println(res3); // 2.0
        System.out.println(res4); // 5.0

        // Mathematics

        // RoundOff: Round off the float or double value to integer value
        int roundOff = Math.round(1.1F);
        System.out.println(roundOff);

        // Ceil Value: Smallest integer that is greater than or equal to the number passed in args
        double ceilValue = Math.ceil(1.1F);
        System.out.println(ceilValue);

        // Floor Value: Largest integer that is smaller than or equal to the number passed in args
        int floorValue = (int)Math.floor(1.1F);
        System.out.println(floorValue);

        // Max: Return greater number between 2 values
        int max = Math.max(2,5);
        int min = Math.min(2,5);
        System.out.println(max);
        System.out.println(min);

        // Note: all the methods present inside the Math class are overloaded to cater different
        // datatypes.

        // Random number generation
        double random = Math.random();
        double randomBetween0to100 = Math.random() * 100;
        int roundedOffRandom = (int)Math.round(randomBetween0to100);
        System.out.println(random); // Number will range between [0,1] a floating point number will generate
        System.out.println(randomBetween0to100);
        System.out.println(roundedOffRandom);

        // Formatting numbers

        // $1,234,567
        // 10%

        // How to format the number to show like above

        // We have a class NumberFormat in Java which can help us for this utility
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyString = currency.format(1234567.891);
        System.out.println(currencyString);

        NumberFormat getPercent = NumberFormat.getPercentInstance();
        String getPerString = getPercent.format(0.1);
        System.out.println(getPerString);
    }
}
