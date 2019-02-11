class moveZerosToLeft {
    static void move_zeros_to_left_in_array(int[] A) {
        // TODO: Write - Your - Code
        int read = A.length - 1;
        int write = A.length - 1;

        while (read > -1) {
            if (A[read] == 0) {
                read--;
            } else if (A[read] != 0) {
                A[write] = A[read];
                write--;
                read--;
            }
        }
        while (write > -1) {
            A[write] = 0;
            write--;
        }

    }
}