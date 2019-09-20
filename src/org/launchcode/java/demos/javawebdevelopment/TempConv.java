package org.launchcode.java.demos.javawebdevelopment;

import java.util.Scanner;

/**
 * From "Java Web Development"
 */
public class TempConv {
    public static void main(String[] args) {
        double fahrenheit;
        double celsius;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Enter the temperature in F: ");
        fahrenheit = in.nextDouble();

        celsius = (fahrenheit - 32) * 5.0/9.0;
        System.out.println("The temperature in C is: " + celsius);
    }

}
