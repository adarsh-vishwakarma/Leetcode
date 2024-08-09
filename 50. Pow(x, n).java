class Solution {
    public double solve(double x, long n) {
        if(n == 0) return 1;
        if(n < 0) {
            // value ko positive me convert kar rahe hai to overflow ho raha hai
            return solve(1/x, -n);
        }

        if(n % 2 != 0) {
            return (x*solve(x*x, (n-1)/2));
        }

        return solve(x*x, n/2);
    }
    public double myPow(double x, int n) {
        //long me convert karna padega
    return solve(x, (long)n);
    }
}
