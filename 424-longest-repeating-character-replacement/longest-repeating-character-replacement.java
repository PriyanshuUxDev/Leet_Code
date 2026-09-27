class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int[] freq = new int[26];
        int maxf=0;
        int maxl=0;
     
        int cnt=0;
        int i=0;
        for(int j=0;j<n;j++){
          char   left=s.charAt(i);
          char  right=s.charAt(j);
            freq[right-'A']++;
            maxf=Math.max(maxf,  freq[right-'A']);
            if((j-i+1) -maxf >k){
                 freq[left-'A']--;
                 for(int l=0;l<=25;l++)  maxf=Math.max(maxf,  freq[l]);
                 i++;
                 
            }
              if((j-i+1) -maxf <=k){
            maxl=Math.max(maxl,j-i+1);
            
              }

           
          
        }
        return maxl;
    }
}