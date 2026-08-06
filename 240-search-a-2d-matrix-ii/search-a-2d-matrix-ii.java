class Solution {
    public boolean searchMatrix(int[][] nums, int t) {
        int n=nums.length;
        int m=nums[0].length;

        int i=n-1;
        int j=0;

        while(i>=0&&j<m){
            if(nums[i][j]==t) return true ;
        if(nums[i][j]>t) i--;
        else{
            j++;
        }
        }
        return false;

    }
}