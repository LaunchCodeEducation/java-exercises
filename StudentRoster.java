package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class StudentRoster {
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int newId;
        String newStudent;

        do {
            System.out.println("Enter Student's name: ");
            newStudent = in.nextLine();
            if (!newStudent.equals("")) {
                System.out.println("Enter Student's ID#: ");
                newId = in.nextInt();
                students.put(newId, newStudent);
                in.nextLine();
            }

        }while (!newStudent.equals(""));

        System.out.println("\nClass roster: ");
        for (Map.Entry<Integer, String> student : students.entrySet()){
            System.out.println(student.getKey() + " " + student.getValue());
        }

    }
}
