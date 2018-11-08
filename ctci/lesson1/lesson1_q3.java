import java.util.ArrayList;

/**********************************************************************************
 * Interview Question 1.3
 * 
 * Implement an algorithm to convert blanck space in the string to %20
 * 
 *********************************************************************************/

public class lesson1_q3 {
    public static void main(String[] args) {
        String str = " Mr John Smith      ";
        char[] charArr = str.toCharArray();
        System.out.println(convertSpace(charArr, 16));
    }

    public static String convertSpace(char[] charArr, int length) {
        String result = new String();
        for (int i = 0; i < length; i++) {
            if (charArr[i] == ' ') {
                result += "%20";
            } else {
                result += charArr[i];
            }
        }
        return result;
    }

}