class Solution {
    public int minAdjacentSwaps(int[] nums, int a, int b) {
        final int MOD= 1_000_000_007;
        long cnt1=0,cnt2=0;
        long ans=0;
        for(int num:nums){
            if(num<a){
                ans+=cnt1+cnt2;
            }else if(num<=b){
                ans+=cnt2;
                cnt1++;
            }else{
                cnt2++;
            }
        }
        return (int)(ans%MOD);
    }
}