import java.lang.reflect.Array;
import java.util.Arrays;

/******************************************************************************
 * Interview Question 1.1
 * 
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 *****************************************************************************/

public class lesson1_q1 {

    public static void main(String[] args) {
        System.out.println(isUnique("abc"));
        System.out.println(isUnique("aabc"));

    }

    public static boolean isUnique(String str) {
        if (str.length() > 128) {
            return false;
        }
        boolean[] uniqueArray = new boolean[128];
        Arrays.fill(uniqueArray, true);

        for (int i = 0; i < str.length(); i++) {
            int ascii = (int) str.charAt(i);
            if (uniqueArray[ascii] == false) {
                return false;
            }
            uniqueArray[ascii] = false;
        }
        return true;
    }
}