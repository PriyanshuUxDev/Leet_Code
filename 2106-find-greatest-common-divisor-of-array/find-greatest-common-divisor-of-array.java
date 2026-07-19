class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int l=Integer.MIN_VALUE;
        int s= Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            s=Math.min(s,nums[i]);
            l=Math.max(l,nums[i]);
        }

        for(int i=s;i>=0;i--){
            if(s%i==0 && l%i==0) return i;
        }

        return  1;
        
        
    }
}