package com.pluralsight;

import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = myScanner.nextLine();

        System.out.println("Enter hours worked: ");
        double hoursWorked = myScanner.nextDouble();

        System.out.println("Enter your pay rate: ");
        double payRate = myScanner.nextDouble();

        double grosspay = hoursWorked * payRate;

        System.out.println("Employee: " + name);
        System.out.printf("Gross Pay:  $%.2f", grosspay);

    }
}
