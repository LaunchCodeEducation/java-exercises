package org.launchcode.java.demos.java4python;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by LaunchCode
 */
public class Fraction extends Number implements Comparable<Fraction> {

    private int numerator;
    private int denominator;

    /** Creates a new instance of Fraction */
    public Fraction(int num, int den) {
        this.numerator = num;
        this.denominator = den;
    }

    public Fraction(int num) {
        this.numerator = num;
        this.denominator = 1;
    }

    public Fraction add(Fraction other) {
        int newNum = other.getDenominator()*this.numerator + this.denominator*other.getNumerator();
        int newDen = this.denominator * other.getDenominator();
        int common = gcd(newNum,newDen);
        return new Fraction(newNum/common, newDen/common );
    }

    public Fraction add(int other) {
        return add(new Fraction(other));
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return String.valueOf(numerator) + "/" + String.valueOf(denominator);
    }

    public boolean equals(Fraction other) {
        int num1 = this.numerator * other.getDenominator();
        int num2 = this.denominator * other.getNumerator();
        if (num1 == num2)
            return true;
        else
            return false;
    }

    public double doubleValue() {
        return Double.valueOf(numerator) / Double.valueOf(denominator);
    }

    public float floatValue() {
        return Float.valueOf(numerator) / Float.valueOf(denominator);
    }

    public int intValue() {
        return numerator / denominator;
    }

    public long longValue() {
        return Long.valueOf(numerator) / Long.valueOf(denominator);
    }

    public int compareTo(Fraction other) {
        int num1 = this.numerator * other.getDenominator();
        int num2 = this.denominator * other.getNumerator();
        return num1 - num2;
    }

    private static int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;
            m = oldn;
            n = oldm%oldn;
        }
        return n;
    }

    /*
    *   Our main method tests our class and demonstrates behavior
    * */
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(1, 4);

        System.out.println(f1.add(1));
        System.out.println(f1.intValue());
        System.out.println(f1.doubleValue());

        ArrayList<Fraction> myFracs = new ArrayList<Fraction>();
        myFracs.add(f1);
        myFracs.add(f2);
        myFracs.add(f3);
        Collections.sort(myFracs);

        for(Fraction f : myFracs) {
            System.out.println(f);
        }
    }

}