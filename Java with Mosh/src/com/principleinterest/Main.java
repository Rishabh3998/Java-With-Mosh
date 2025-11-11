package com.principleinterest;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        // Create a program to find Mortgage
        Scanner sc = new Scanner(System.in);

        // Get Principle
        System.out.print("Enter Principle: ");
        double principleAmt = sc.nextDouble();

        // Get Annual Interest [0-100]% p.a (Divide by 12 to get monthly interest)
        System.out.print("Enter Annual Interest: ");
        double annualInt = sc.nextDouble();

        // Get duration (No. of years)
        System.out.print("Enter years: ");
        int years = sc.nextInt();

        // Number of months
        int numberOfMonths = years * 12;

        // Monthly Interest
        double monthlyInterestRate = (annualInt / 12) / 100;

        // Numerator
        double numerator = monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfMonths);

        // Denominator
        double denominator = Math.pow((1 + monthlyInterestRate), numberOfMonths) - 1;

        // Calculate Mortgage (Monthly Payments)
        double result = principleAmt * (numerator / denominator);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String currencyString = currency.format(result);

        System.out.println("Mortgage: " + currencyString);

        // Mosh's code
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle: ");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte period = scanner.nextByte();
        int numberOfPayments = period * MONTHS_IN_YEAR;

        double mortgage = principle * (monthlyInterest * Math.pow((1 + monthlyInterest), numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}
