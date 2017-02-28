package org.launchcode.java.demos.java4python;

import java.util.Scanner;

/**
 * Created by LaunchCode
 */
public class DayPrinter {
    public static void main(String[] args) {

        System.out.println("Enter a integer: ");
        Scanner in = new Scanner(System.in);
        int dayNum = in.nextInt();

        String day;
        switch (dayNum) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            default:
                // in this example, this block runs if none of the above blocks match
                day = "Int does not correspond to a day of the week";
        }
        System.out.println(day);
    }
}