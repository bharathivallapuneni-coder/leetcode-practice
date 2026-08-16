class Solution {
    public double myPow(double x, int n) {
        long pow = n;
        if (pow < 0) {
            x = 1 / x;
            pow = -pow;
        }
        double res = 1;
        while (pow > 0) {
            if (pow % 2 == 1) {
                res = res * x;
            }
            x = x * x;
            pow = pow / 2;
        }
        return res;
    }
}