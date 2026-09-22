class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int i=0;
        int ans=0;
        for(int j=0;j<n;j++){
            if(nums[j]==1){
                ans=Math.max(ans,j-i+1);
            }else{
                i=j+1;
            }
        }
        return ans;
        
    }
}