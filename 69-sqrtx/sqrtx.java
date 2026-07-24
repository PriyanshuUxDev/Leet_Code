class Solution {
    public int mySqrt(int x) {
     int st = 0;
        int end = x;
        int ans = 0;

        while (st <= end) {
            int mid = st + (end - st) / 2;

            long sq = (long) mid * mid;

            if (sq > x) {
                end = mid - 1;
            } else {
                ans = mid;
                st = mid + 1;
            }
        }

        return ans;
    }
}