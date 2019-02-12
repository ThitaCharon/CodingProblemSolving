class MergeIntervals {
    static ArrayList<Tuple<Integer, Integer>> merge_intervals(ArrayList<Tuple<Integer, Integer>> v1) {
        // TODO: Write - Your - Code
        if (v1 == null || v1.size() < 1) {
            return null;
        }
        ArrayList<Tuple<Integer, Integer>> result = new ArrayList<Tuple<Integer, Integer>>();

        result.add(new Tuple<Integer, Integer>(v1.get(0).x, v1.get(0).y));
        int j = 0;
        for (int i = 1; i < v1.size(); i++) {
            int n = result.get(result.size() - 1).x;
            int m = result.get(result.size() - 1).y;
            int x = v1.get(i).x;
            int y = v1.get(i).y;
            if (x >= n && x <= m) {
                if (y > m) {
                    result.get(result.size() - 1).y = y;
                }
            } else {
                result.add(new Tuple<Integer, Integer>(v1.get(i).x, v1.get(i).y));
            }

        }

        return result;
    }
}