class Solution {
    public boolean uniformArray(int[] nums1) {
        int n = nums1.length;
        int even1min = Integer.MAX_VALUE;
        int odd1min = Integer.MAX_VALUE;
        int even2min = Integer.MAX_VALUE;
        int odd2min = Integer.MAX_VALUE;

        int ecnt = 0;
        int ocnt = 0;

        for (int j : nums1) {

            if (j % 2 == 0) {
                ecnt++;
                
            } else {
       
                odd1min = Math.min(odd1min, j);
            }
        }
               if(ecnt==n) return true ;

       for(int i:nums1){
        if(i % 2 == 0 && i<odd1min ) return false;
       }
       return true;

        

     
        
    }
}