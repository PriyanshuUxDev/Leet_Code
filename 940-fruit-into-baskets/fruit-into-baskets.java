class Solution {
    public int totalFruit(int[] nums) {
        Map<Integer, Integer> mpp = new HashMap<>();
        int ans = 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            mpp.put(nums[j], mpp.getOrDefault(nums[j], 0) + 1);
            if (mpp.size() > 2) {
                mpp.put(nums[i], mpp.get(nums[i]) - 1);
                if (mpp.get(nums[i]) == 0) {
                    mpp.remove(nums[i]);
                }
                i++;
            }
            if (mpp.size() <= 2) {
                ans = Math.max(ans, j - i + 1);
            }
        }
        return ans;
    }
}

