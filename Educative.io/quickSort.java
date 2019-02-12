class quickSort {
    static void quick_sort(int[] arr) {
        // TODO: Write - Your - Code
        quick_sort_rec(arr, 0, arr.length - 1);
    }

    static void quick_sort_rec(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);
            // System.out.println("pivot " + pivot);
            quick_sort_rec(arr, low, pivot - 1);
            quick_sort_rec(arr, pivot + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {

        int p = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < p) {
                i += 1;
                swop(arr, i, j);
            }
        }
        i += 1;
        swop(arr, i, high);
        return i;
    }

    static void swop(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}