package com.codewithmosh;

public class Main {
    public static void main(String[] args) {
        // write your code here
        // System is a class in which some members are defined which can be
        // used via dot operator
        System.out.println("Hello World");

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
    }
}
