class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int diff = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
        int k = n - 1;
            int j = i + 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int d = Math.abs(target - sum);
                if (d < diff) {
                    diff = d;
                    ans = sum;
                } else if (sum > target)
                    k--;
                else if (sum < target) {
                    j++;
                } else {
                    return sum;
                }
            }
        }
        return ans;
    }
}