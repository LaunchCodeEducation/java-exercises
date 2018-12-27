package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class StringArrayList {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newWord;
        System.out.println("Enter a word: ");

        do {
            newWord = in.nextLine();

            if (!newWord.equals("")) {
                stringArrayList.add(newWord);
            }

        } while (!newWord.equals(""));

        for (String word: stringArrayList) {
            if (word.length() == 5){
                System.out.println(word);
            }
        }

        }


    }

        //String[] stringArray = {"five", "faith", "flop", "mopsy"};
//        for (String word : stringArray) {
//            if (word.length() == 5) {
//                System.out.println(word);
//            } else {
//                continue;
//            }
//        }
//    }
//}

