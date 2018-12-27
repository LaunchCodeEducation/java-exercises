package exercises;
// Java Program to illustrate reading from FileReader
// using BufferedReader
import java.io.*;
import java.nio.file.*;
public class readFromFile {
    public static String readFileAsString(String fileName) {
        try {
            String data;
            data = new String(Files.readAllBytes(Paths.get(fileName)));
            return data;
        } catch (Exception e) {
            return null;
        }
    }
}

//    public static String bufferedReading(File file) throws Exception {
//        try {
//            BufferedReader br = new BufferedReader(new FileReader(file));
//            String st;
//            while ((st = br.readLine()) != null)
//                return st;
//
//        } catch (Exception e) {
//            return null;
//        }
//    }
//}
//


//    public static void main(String[] args) throws Exception{
//        {
//            File file = ""
//
//        }
//    }
//}
