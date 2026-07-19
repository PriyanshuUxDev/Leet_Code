class Solution {
    public String longestCommonPrefix(String[] nums) {
        String word=nums[0];
        String ans="";
        for(int i=1;i<nums.length;i++){
          String   temp=nums[i];
            int j=0;
            int k=0;
            while(k<word.length()
                    && j < temp.length()&&
                    temp.charAt(j++) ==word.charAt(k) ){
                
                 ans=ans+word.charAt(k++);
            }
            word=ans;
            ans="";
        }
        return word;
        
    }
}