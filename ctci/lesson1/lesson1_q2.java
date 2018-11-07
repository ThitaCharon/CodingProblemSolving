import java.util.ArrayList;
import java.util.Arrays;

/**********************************************************************************
 * Interview Question 1.2
 * 
 * Implement an algorithm to determine if a string is a permutation of another string
 * 
 *********************************************************************************/

public class lesson1_q2 {
    public static void main(String[] args) {
        System.out.println(isPermutation("", ""));
        System.out.println(isPermutation("Dog", "God"));
        System.out.println(isPermutation("dog", "god"));
        System.out.println(isPermutation("abcb", "bbac"));
        System.out.println(isPermutation("thita", "hatti"));
    }

    public static boolean isPermutation(String str, String str2) {
        // check the length
        if (str.length() < 1 || str2.length() < 1 || str.length() != str2.length()) {
            return false;
        }
        char[] charA = str.toCharArray();
        char[] charB = str2.toCharArray();

        Arrays.sort(charA);
        Arrays.sort(charB);
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] != charB[i]) {
                return false;
            }
        }
        return true;
    }

}
