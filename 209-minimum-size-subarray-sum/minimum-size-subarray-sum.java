class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int n=nums.length;
        if(n==1 && nums[0]>=target) return 1;
        else if(n==1 ) return 0;
       
        int j=0;
            int sum=0;
            int ans=Integer.MAX_VALUE;

            for(int i=0;i<n;i++){
                    sum+=nums[i];

                    while(sum>=target ){
                        ans=Math.min(ans,i-j+1);
                        sum-=nums[j++];
                    }
            }
           if(ans==Integer.MAX_VALUE) return 0;
       
        return  ans ;
        
    }
}