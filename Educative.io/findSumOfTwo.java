// find_sum_of_two function return true if
// there are two values in array who
// sum to value and returns false otherwise
class findSum {
    static boolean find_sum_of_two(int[] arr, int val) {
        // TODO: Write - Your - Code
        if (arr == null || arr.length < 2) {
            return false;
        }

        HashSet<Integer> hash = new HashSet<>();
        // hash.add(val-arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (!hash.isEmpty() && hash.contains(val - arr[i])) {
                return true;
            }
            hash.add(arr[i]);
        }

        return false;
    }
}