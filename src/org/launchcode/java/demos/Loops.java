package org.launchcode.java.demos;

/**
 * Created by LaunchCode
 */
public class Loops {

    public static void main(String[] args) {

        System.out.println("printZeroToTen :: ");
        printZeroToTen();

        System.out.println("printCharactersFromAString :: ");
        printCharactersFromAString();

    }

    // Print integers from 0 to 10
    public static void printZeroToTen() {

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void printCharactersFromAString() {
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book...";

        for (char c : text.toCharArray()) {
            System.out.print(c);
        }
    }
}
