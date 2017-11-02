package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {

    private static final double PI = 3.14;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a radius:");
        double radius = scanner.nextDouble();
        double area = PI * Math.pow(radius, 2);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

    }
}
