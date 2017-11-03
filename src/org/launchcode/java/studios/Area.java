package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    private static final double PI = 3.14;
    private static boolean validRadius = false;

    private static void validateRadius(double radius) {
        if (radius >= 0) {
            validRadius = true;
        } else {
            System.out.println("Not a valid radius!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius;
        do {
            System.out.println("Enter a radius:");
            radius = scanner.nextDouble();
            validateRadius(radius);
        } while (!validRadius);
        double area = PI * Math.pow(radius, 2);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
