/**********************************************************************************
 * Interview Question 1.6
 * 
 * Implement an algorithm to compress the string i.e. Input aabcccccaaa ->
 * a2b1c5a3
 *********************************************************************************/

public class lesson1_q6 {
    public static void main(String[] args) {
        System.out.println("Original : " + compressionString("aabcaaa"));
        System.out.println("BuildNewString : " + compressionString("aabcccccaaa"));
    }

    /*
     * Check the length if the origanl is shorter then return the original otherwise
     * build the new string using StringBuilder the algorithm run O(n)
     */
    public static String compressionString(String str) {
        int compressLength = getCompressionLength(str);
        if (compressLength > str.length()) {
            return str;
        }
        StringBuilder compressStr = new StringBuilder(compressLength);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
            if (i + 1 == str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressStr.append(str.charAt(i));
                compressStr.append(count);
                count = 0;
            }
        }
        return compressStr.toString();
    }

    /*
     * Check the difference of current and next position mutiply by 2 to return the
     * final lenget
     */
    public static int getCompressionLength(String str) {
        int countDiffer = 1;
        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) != str.charAt(i + 1)) {
                countDiffer++;
            }
        }
        return countDiffer * 2;
    }
}