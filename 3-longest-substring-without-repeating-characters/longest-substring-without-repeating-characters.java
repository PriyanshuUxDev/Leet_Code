class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet <Character> st=new HashSet<>();


     int l=0;
     int ans=0;

     for(int r=0;r<s.length();r++){

        while(st.contains(s.charAt(r))){
            st.remove(s.charAt(l));
            l++;
        }
        ans=Math.max(ans,r-l+1);
        st.add(s.charAt(r));
     }
     return ans;
    }
}