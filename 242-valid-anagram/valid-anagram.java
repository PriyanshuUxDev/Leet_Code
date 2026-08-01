class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mpp=new HashMap<>();
        int n=s.length();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(mpp.containsKey(c)){
                 mpp.put(c,mpp.get(c)+1);
            }else{
                mpp.put(c,1);
            }
        }
        for(int i=0;i<n;i++){
            char c=t.charAt(i);
            if(mpp.containsKey(c)  && mpp.get(c) > 0){
                mpp.put(c,mpp.get(c)-1);
            }else{
                return false;
            }
        }

        return true ;

        
    }
}