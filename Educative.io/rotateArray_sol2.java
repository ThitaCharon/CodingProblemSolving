class rotateArray {
    static void rotate_array(List<Integer> arr, int n) {
        // TODO: Write - Your - Code
        if (n < 0) {
            rotate_left(arr, n * -1);
        } else if (n > 0) {
            reverse_right(arr, n);
        }
    }

    static void rotate_left(List<Integer> arr, int n) {

        int len = arr.size();
        // System.out.println("Left" + n );
        int[] temp = new int[n];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr.get(i);
            // System.out.println(temp[i] + " " );
        }
        int j = n;
        for (int i = 0; i < arr.size() - n; i++) {
            arr.set(i, arr.get(j));
            j++;
        }
        int m = 0;
        for (int i = n - 1; i < arr.size(); i++) {
            arr.set(i, temp[m]);
            m++;
        }
        // for (int i=0; i<arr.size();i++){
        // System.out.print(arr.get(i) +", " );
        // }

    }

    static void reverse_right(List<Integer> arr, int n) {
        // System.out.println("Right" + n);
        int len = arr.size();
        int[] temp = new int[n];
        int start = len - n;
        for (int i = start; i < temp.length; i++) {
            temp[i] = arr.get(i);
            // System.out.println("kdsl" );
        }
    }
}