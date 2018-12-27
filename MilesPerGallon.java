package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args){
        double miles;
        double gallons;
        double mpg;
        Scanner in = new Scanner(System.in);

        System.out.println(" How many miles have you driven? ");
        miles = in.nextDouble();
        System.out.println(" How many gallons of gas have you used? ");
        gallons = in.nextDouble();
        mpg = miles/gallons;
        System.out.println(mpg);
    }
}