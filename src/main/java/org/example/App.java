/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Andrew Howard
 */
package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        double subTotal, tax, total;
        Scanner keyboardInput =  new Scanner(System.in);
        System.out.print("Enter the price of item 1: ");
        int item1 = keyboardInput.nextInt();
        System.out.print("Enter the quantity of item 1: ");
        int quant1 = keyboardInput.nextInt();
        System.out.print("Enter the price of item 2: ");
        int item2 = keyboardInput.nextInt();
        System.out.print("Enter the quantity of item 2: ");
        int quant2 = keyboardInput.nextInt();
        System.out.print("Enter the price of item 3: ");
        int item3 = keyboardInput.nextInt();
        System.out.print("Enter the quantity of item 3: ");
        int quant3 = keyboardInput.nextInt();

        subTotal = (item1 * quant1) + (item2 * quant2) + (item3 * quant3);
        System.out.println("Subtotal: $" + String.format("%.2f", subTotal));

        tax = subTotal * .055;
        System.out.println("Tax: $" + String.format("%.2f", tax));

        total = subTotal + tax;
        System.out.println("Total: $" + String.format("%.2f", total));


    }
}
