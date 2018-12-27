package exercises;
import java.util.Scanner;

public class AreaOfRectangle{
    public static void main(String[] args){
        double length;
        double width;
        double area;
        Scanner in = new Scanner(System.in);


        System.out.println("Enter the width of your rectangle: ");
        length = in.nextDouble();
        System.out.println("Enter the length of your rectangle: ");
        width = in.nextDouble();
        area = length * width;

        System.out.println(area);
    }
}
