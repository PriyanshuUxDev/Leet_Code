class Solution {
    public int[] twoSum(int[] nums, int t) {
        int i = 0;
        int j = nums.length - 1;
       while(i<j){
        if(nums[i]+nums[j]==t) return new int[]{i+1,j+1};

        if(nums[i]+nums[j]>t){
            j--;

        }else if(nums[i]+nums[j]<t){
                i++;
        }
       }
       return new int[]{};
    }
}