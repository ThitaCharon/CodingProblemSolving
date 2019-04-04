class powerNum {
    static double power(double x, int n) {
        // TODO: Write - Your - Code
        if (n == 0)
            return 1;
        else if (n == 1)
            return x;

        double result = powerOf(x, n);
        if (n < 0) {
            result = 1.0 / result;
        }
        return result;
    }

    static double powerOf(double x, int n) {
        double ans = 1;
        if (n < 0) {
            n *= -1;
        }
        while (n > 0) {
            ans *= x;
            n--;
        }
        return ans;
    }
}