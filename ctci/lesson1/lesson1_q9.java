/**********************************************************************************
 * Interview Question 1.9
 * 
 * Implement method check string B is a rolate string of string A
 **********************************************************************************/

public class lesson1_q9 {
    public static void main(String[] args) {
        System.out.println(isRotateString("melonwater", "melonwater"));
        System.out.println(isRotateString("", "melonwater"));
        System.out.println(isRotateString("", ""));
        System.out.println(isRotateString("malon", "lolma"));
    }

    public static boolean isRotateString(String s1, String s2) {
        if (s1.length() < 1 || s2.length() < 1 || s1.length() != s2.length()) {
            return false;
        }
        String ss1 = s1 + s1;
        return ss1.contains(s2);
    }
}