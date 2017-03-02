package org.launchcode.java.demos;

/**
 * Created by LaunchCode
 */
public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double computeDistanceFromOrigin() {
        return Math.sqrt((x*x + y*y));
    }

    public Point computeMidpoint(Point p) {

        double midpointX = (x + p.getX()) / 2;
        double midpointY = (y + p.getY()) / 2;

        return new Point(midpointX, midpointY);
    }

    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public static void main(String[] args) {

        Point p1 = new Point(3,3);
        System.out.println(p1.toString());

        Point p2 = new Point(-2, 4);
        System.out.println(p2);

        System.out.println("p1 distance from origin: " + p1.computeDistanceFromOrigin());

        System.out.println("midpoint of p1 and p2: " + p1.computeMidpoint(p2));
    }
}
