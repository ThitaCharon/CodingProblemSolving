
/**********************************************************************************
 * Interview Question 1.4
 * 
 * Implement an algorithm to check if is a permutation of a palindrome Input:
 * Tact Coa Output: True (permutation:"taco cat", "atco cata", etc)
 *********************************************************************************/

public class lesson1_q4 {
    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("Tact Coa"));
        System.out.println(isPermutationOfPalindrome(" thita "));
    }

    // create a table tracking frequency of each character
    public static boolean isPermutationOfPalindrome(String str) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        char[] charArr = str.toCharArray();
        int index = -1;
        int countOdd = 0;
        for (char c : charArr) {
            // convert char to int i.e. a->0, b->1, z->26
            index = Character.getNumericValue(c) - Character.getNumericValue('a');
            System.out.println(c + " index is " + index + " ");
            if (index > -1) {
                table[index]++;
                if (table[index] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        System.out.print("\n");
        for (char c : charArr) {
            System.out.print(c);
        }
        System.out.print("\n");
        for (int t : table) {
            System.out.print(t);
        }
        System.out.print("\n");
        return countOdd <= 1;
    }
}