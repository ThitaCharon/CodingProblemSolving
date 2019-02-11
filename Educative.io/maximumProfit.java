class stock_prices {
    public static Tuple find_buy_sell_stock_prices(int[] arr) {
        // TODO: Write - Your - Code
        if (arr == null || arr.length < 2) {
            return null;
        }

        // tracking selling , buying and profit
        int buy = arr[0];
        int sell = arr[1];
        int cur_prof = sell - buy;
        int gobal_prof = cur_prof;

        for (int i = 2; i < arr.length; i++) {
            if (buy > sell) {
                buy = sell;
            }
            sell = arr[i];
            cur_prof = sell - buy;
            if (gobal_prof < cur_prof) {
                gobal_prof = cur_prof;
            }
        }
        Tuple<Integer, Integer> result = new Tuple<Integer, Integer>(buy, gobal_prof + buy);
        /*
         * class Tuple<X, Y> { public X x; public Y y;
         * 
         * public Tuple(X x, Y y) { this.x = x; this.y = y; } }
         */
        return result;
    }
}