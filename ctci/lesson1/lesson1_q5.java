
/******************************************************************************
 * Interview Question 1.5
 * 
 * Given two strings implement an algorithm to check they are one edition has
 * been performed. Example pale, ple -> true pales, pale -> true pale, bale ->
 * true bale, bake -> false
 *******************************************************************************/

public class lesson1_q5 {
    public static void main(String[] args) {
        System.out.println(oneAway("pale", "bake"));
        System.out.println(oneAway("pale", "bale"));
        System.out.println(oneAway("please", "plea"));
        System.out.println(oneAway("thit", "thita"));
        System.out.println(oneAway("pale", "ple"));
    }

    /*
     * Find the differnt length if in a consider cases continue on checking either
     * editon or deletion
     */
    public static boolean oneAway(String first, String second) {
        if (Math.abs(first.length() - second.length()) > 1) {
            System.out.println("Not consider case");
            return false;
        } else if (Math.abs(first.length() - second.length()) == 0) {
            System.out.println("equal size : check total modification");
            return checkEditon(first, second);
        } else if (Math.abs(first.length() - second.length()) == 1) {
            System.out.println("different == 1 -> check deletion based on shorter string");
            if (first.length() > second.length()) {
                return checkDeletion(second, first);
            } else {
                return checkDeletion(first, second);
            }
        }
        return false;
    }

    public static boolean checkDeletion(String str, String modify) {
        int countOfChange = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != modify.charAt(i)) {
                countOfChange++;
                i++;
            }
        }
        return countOfChange <= 1;
    }

    public static boolean checkEditon(String first, String second) {
        int countOfChange = 0;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                countOfChange++;
            }
        }
        return countOfChange <= 1;
    }
}