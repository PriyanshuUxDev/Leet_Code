class Solution {
    public int removeDuplicates(int[] nums) {
        int n= nums.length;
        int p=nums[0];
        int j=0;
        int c=0;
        for(int i:nums){
            if(c<2&& p==i ){
                nums[j++] = i;
                c++;
            }
            else if(p!=i   ){
                nums[j++]=i ;
                c=1;
            }
            p=i;

        }  
        return j;
    }
}