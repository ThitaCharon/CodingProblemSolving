import java.util.List;

class findLowHigh {
    static int find_low_index(List<Integer> arr, int key) {
        // TODO: Write - Your - Code
        return getLowIndex(arr, key, 0, arr.size() - 1);
    }

    static int getLowIndex(List<Integer> arr, int key, int low, int high) {

        int lowIndex = -1;
        int mid = low + ((high - low) / 2);

        while (low <= high) {
            // System.out.println("lowIndex update" + lowIndex + " mid is " + mid + " high
            // is " + high + " low is " + low);
            if (key == arr.get(mid)) {
                lowIndex = mid;
            }
            if (key <= arr.get(mid)) {
                high = mid - 1;
                mid = low + ((high - low) / 2);
            } else if (key > arr.get(mid)) {
                low = mid + 1;
                mid = low + ((high - low) / 2);
            }
        }
        return lowIndex;
    }

    static int find_high_index(List<Integer> arr, int key) {
        // TODO: Write - Your - Code
        return getHighIndex(arr, key, 0, arr.size() - 1);
    }

    static int getHighIndex(List<Integer> arr, int key, int low, int high) {

        int highIndex = -1;
        int mid = low + ((high - low) / 2);

        while (low <= high) {
            // System.out.println("lowIndex update" + highIndex + " mid is " + mid + " high
            // is " + high + " low is " + low);
            if (key == arr.get(mid)) {
                highIndex = mid;
            }
            if (key < arr.get(mid)) {
                high = mid - 1;
                mid = low + ((high - low) / 2);
            } else if (key >= arr.get(mid)) {
                low = mid + 1;
                mid = low + ((high - low) / 2);
            }
        }
        return highIndex;
    }

}