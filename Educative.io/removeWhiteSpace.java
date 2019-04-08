class removeSpaces {
    static void remove_white_spaces(char[] s) {

        int write = 0;
        for (int i = 0; i < s.length; i++) {
            while (s[i] == ' ' || s[i] == '\0') {
                i++;
            }
            s[write] = s[i];
            write++;
        }
    }
}