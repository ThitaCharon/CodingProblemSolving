class numberValid {
    enum STATE {
        start, integer, descimal, unknown, afterdesc
    };

    static boolean is_number_valid(String s) {
        // TODO: Write - Your - Code
        if (s.isEmpty())
            return true;
        int i = 0;

        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            ++i;
        }

        STATE current_state = STATE.start;
        while (i < s.length()) {
            current_state = getNextState(current_state, s.charAt(i));
            if (current_state == STATE.unknown) {
                return false;
            }
            i++;
        }

        return true;
    }

    static STATE getNextState(STATE current_state, char ch) {
        switch (current_state) {
        case start:
            System.out.println("Start : " + ch);
        case integer:
            System.out.println("integer : " + ch);
            if (ch >= '0' && ch <= '9') {
                return STATE.integer;
            } else if (ch == '.') {
                return STATE.descimal;
            }
        case descimal:
            System.out.println("descimal: " + ch);
            if (ch >= '0' && ch <= '9') {
                return STATE.afterdesc;
            } else if (ch == '.') {
                return STATE.unknown;
            }
        case afterdesc:
            System.out.println("afterdesc: " + ch);
            if (ch >= '0' && ch <= '9') {
                return STATE.afterdesc;
            } else {
                return STATE.unknown;
            }
        }
        return STATE.unknown;
    }
}