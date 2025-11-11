package com.fizzbuzz;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Problem: If a number is divisible by 5 then print "Fizz", If a number is divisible by 3 print "Buzz"
        // If the number is divisible by both 3 and 5 then print "FizzBuzz", else print the same number
        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        if (number % 5 == 0) {
            if (number % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println("Fizz");
            }
        } else if (number % 3 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
