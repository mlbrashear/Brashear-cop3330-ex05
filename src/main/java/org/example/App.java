package org.example;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Mary Brashear
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Declare the two numbers for the user to enter
        int first, second;
        Scanner sc = new Scanner(System.in);

        //Ask user for the two numbers
        System.out.println("What is the first number?");
        first = sc.nextInt();
        System.out.println("What is the second number?");
        second = sc.nextInt();

        //Print out the two numbers put together for the math equation
        System.out.println(first + " + " + second + " = " + (first + second) + "\n" + first + " - " + second + " = " + (first - second) + "\n" + first + " * " + second + " = " + (first * second) + "\n" + first + " / " + second + " = " + (first / second));

        sc.close();
    }
}