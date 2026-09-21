class Solution {
    public int maxScore(int[] nums, int k) {
        int n=nums.length;

        int sum=0;
        int lsum=0;
        int rsum=0;
        for(int i=0;i<k;i++) lsum+=nums[i];

        sum=lsum;
        int j=n-1;
        for(int i=k-1;i>=0;i--){
            lsum-=nums[i];
            rsum+=nums[j--];
        sum=Math.max(sum,lsum+rsum);
        }


        return sum;
        
    }
}