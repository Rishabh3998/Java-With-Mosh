package com.controlflows;

public class Main {
    public static void main (String[] args) {
        // Comparison Operators
        int x = 1;
        int y = 1;
        System.out.println(x == y); // true
        System.out.println(x != y); // false
        System.out.println(x >= y); // true
        System.out.println(x <= y); // true

        // Logical Operators
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm); // true

        boolean hasHighIncome = true;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible); // true

        String weather = "";
        if (temperature > 30) {
            weather = "It's a Hot day, Drink plenty of water";
        } else if (temperature >= 20 && temperature <= 30) {
            weather = "It's a nice day";
        } else {
            weather = "It's a cold day";
        }

        System.out.println(weather);

        // Simplifying the If statements
        int income = 120_000;
        boolean hasHighIncomeIndividual = (income > 100_000);
        System.out.println(hasHighIncomeIndividual);

        String className = income > 100_000 ? "First Class" : "Economy";
        System.out.println(className);

        // Switch statements
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You are an admin");
                break;

            case "moderator":
                System.out.println("You are a moderator");
                break;

            default:
                System.out.println("You are a guest");
                break;
        }
    }
}
