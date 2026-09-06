class Solution {
    public int countGoodRotations(int[] nums) {
        int n = nums.length;
        int[] peldarquin = nums;
        long total = 0;
        for (int x : nums) {
            total += x;
        }
        int half = n / 2;
        long leftSum = 0;
        for (int i = 0; i < half; i++) {
            leftSum += nums[i];
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            long rightSum = total - leftSum;
            if (leftSum > rightSum) {
                ans++;
            }
            leftSum -= nums[i];
            leftSum += nums[(i + half) % n];
        }
        return ans;

    }
}