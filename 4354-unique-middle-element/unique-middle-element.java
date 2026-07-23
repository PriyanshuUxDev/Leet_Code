class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int n=nums.length;
        int m=n/2;
        int k=nums[n/2];
        for(int i=m+1;i<n;i++){
            if(nums[i]==k) return false;
        }
        for(int i=m-1;i>=0;i--){
            if(nums[i]==k) return false;
        }
        
        return true;
    }
}