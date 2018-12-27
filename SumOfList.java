package exercises;
import java.util.Scanner;
import java.util.ArrayList;

public class SumOfList{
    public static void main(String[] args){
        ArrayList<Integer> nums = new ArrayList();
        Scanner in = new Scanner(System.in);
        Integer num;
        int counter = 0;

        System.out.println("Enter a number (enter 0 to end: ");
        do {
            num = in.nextInt();
            if (num != 0) ;
            nums.add(num);
        } while
        (num != 0);

        for (int i : nums) {
            if (i % 2 == 0) {
                counter += i;
            } else {
                continue;
            }
        }System.out.println(counter);
    }
}
