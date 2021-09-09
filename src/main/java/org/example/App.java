/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexander Williams
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        java.util.Scanner scan = new java.util.Scanner(System.in);

        double price;
        double quantity;
        double subtotal = 0.00;

        for(int i = 1; i < 4; i++)
        {
            System.out.print("Enter the price of item " + i + ": ");
            price = scan.nextInt();

            System.out.print("Enter the quantity of item " + i + ": ");
            quantity = scan.nextInt();

            subtotal += price * quantity;
        }

        double tax = subtotal * .055;
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
