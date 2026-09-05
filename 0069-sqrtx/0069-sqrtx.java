class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }
        int a = 1;
        while (a <= x / a) {
            a++;
        }
        return a - 1;
    }
}