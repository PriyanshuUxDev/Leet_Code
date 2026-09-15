class Solution {
    public int maxSubArray(int[] nums) {
 int sum=0;
 int MaxSum=Integer.MIN_VALUE;
 int j=0;
//  if(nums.length==1) return nums[0];
 for(int i=0;i<nums.length;i++){
    sum+=nums[i];
    MaxSum=Math.max(sum,MaxSum);
    if(sum<0){
        sum=0;
    }
 }
 return MaxSum;
        
    }
}