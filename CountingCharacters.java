package exercises;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;


//import java.util.regex.Matcher;
//import java.util.regex.Pattern;


public class CountingCharacters {
    public static String readFileAsString(String fileName){
        try{
            String data;
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            return data;
        } catch (Exception e) {
            return null;

        }


}
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        String myString;
//        System.out.println("Enter text to be evaluated: ");
//        myString = in.nextLine();
        myString = readFileAsString("/Users/bradleyboggs/IdeaProjects/java-exercise" +
                "s/src/exercises/mydatafile.txt");
        char[] myCharArray = myString.toLowerCase().toCharArray();
        HashMap<String, Integer> charCounter = new HashMap<>();
        Integer i;

        for (char c : myCharArray) {
//            Matcher matchy = c.Matcher(['a-zA-Z']);
//            if (Matcher matchy = c.matches == [a-zA-z]){
            if (Character.isLetter(c)) {
                if (!charCounter.containsKey(String.valueOf(c))) {
                    i = 1;
                    charCounter.put(String.valueOf(c), i);

                } else {
                    i = charCounter.get(String.valueOf(c));
                    charCounter.replace(String.valueOf(c), i, ++i);

                }
            } else {
                continue;
            }
        }

            System.out.println("\nCharacter Map");
            for (Map.Entry<String, Integer> charKv : charCounter.entrySet()) {
                System.out.println(charKv.getKey() + ": " + charKv.getValue());

            }


        }

    }



