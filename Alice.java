package exercises;

import java.util.Scanner;

public class Alice{
    public static void main(String[] args){
        String text = "Alice was beginning to get very tired of sitting by her sister on the bank, " +
                "and of having nothing to do: once or twice she had peeped into the book her sister was reading, " +
                "but it had no pictures or conversations in it, 'and what is the use of a book,' t" +
                "hought Alice 'without pictures or conversation?'";
        String text_lc;
        Scanner in = new Scanner(System.in);
        String search_term;
        String search_term_lc;


        System.out.print("Enter a term to search for: ");
        search_term = in.nextLine();
        search_term_lc = search_term.toLowerCase();
        text_lc = text.toLowerCase();
        System.out.println(text_lc.contains(search_term_lc));

    }
}
