import java.util.Arrays;
class reverseWords {
    public static void reverse_words(char[] sentence) {
        // TODO: Write - Your - Code
        int len = sentence.length;
        reverseAll(sentence, 0, len - 2);
        int start = 0;
        int end;
        while (true) {
            // find the start index of a word while skipping spaces.
            System.out.println(Arrays.toString(sentence));
            while (sentence[start] == ' ') {
                ++start;
            }

            if (sentence[start] == '\0') {
                break;
            }

            // find the end index of the word.
            end = start + 1;
            while (sentence[end] != '\0' && sentence[end] != ' ') {
                ++end;
            }

            // let's reverse the word in-place.
            reverseAll(sentence, start, end - 1);

            start = end;
        }
    }

    public static void reverseAll(char[] str, int start, int end) {
        // check valid length
        if (str == null || str.length < 2) {
            return;
        }

        while (start < end) {

            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        // System.out.println(Arrays.toString(str));
    }

}