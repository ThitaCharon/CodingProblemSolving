import java.util.LinkedHashSet;
import java.util.Set;
class removeDuplicates {
    static void remove_duplicates(char[] str) {
        // TODO: Write - Your - Code
        Set<Character> hashset = new LinkedHashSet<Character>();
        int writeIndex = 0;
        for (int i = 0; i < str.length; i++) {
            if (!hashset.contains(str[i])) {
                hashset.add(str[i]);
                System.out.println(hashset);
                str[writeIndex] = str[i];
                writeIndex++;
            }
        }

        str[writeIndex + 1] = '\0';

    }
}