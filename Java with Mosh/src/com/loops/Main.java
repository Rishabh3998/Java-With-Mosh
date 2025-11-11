package com.loops;

import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("Hello World!!");
        }

        byte j = 0;
        while (j < 5) {
            System.out.println("Hello World!!");
            j++;
        }

        String input = "";
        Scanner sc = new Scanner(System.in);
        while (!input.equals("quit")) {
            System.out.println("Input: ");
            input = sc.next().toLowerCase();
        }

        do {
            System.out.println("Input: ");
            input = sc.next().toLowerCase();
        } while (!input.equals("quit"));

        String[] fruits = {"apple", "mango", "orange"};

        for (int i = 0 ; i < fruits.length ; i++) {
            System.out.println(fruits[i]);
        }

        for (String fruit :  fruits) {
            System.out.println(fruit);
        }
    }
}
