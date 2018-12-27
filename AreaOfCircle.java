package exercises;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        double radius;
        final double PI = 3.14159;
        double area;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of your circle");
        radius = in.nextDouble();

        while (radius < 0) {
            System.out.println("You must enter a positive number");
            System.out.println("Enter the radius of your circle");
            radius = in.nextDouble();

        }

            area = PI * radius * radius;
            System.out.println("The area of a circle with radius " + radius + " is " + area + ".");


        }
    }

