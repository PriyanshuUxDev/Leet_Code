class Solution {
    public int lengthOfLongestSubstring(String s) {

            int ans=0;
        for(int r=0;r<s.length();r++){
 int[] hash = new int[256]; 
        for(int j=r;j<s.length();j++){
            if(hash[s.charAt(j)]==1) break;
            int len=j-r+1;
            ans=Math.max(ans,len);
            hash[s.charAt(j)]=1;
        }
            
        }
        return ans;
    }
}