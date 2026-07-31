class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        String ss=s+s;
        int nn=ss.length();
        int m=goal.length();
        int i=0;
        int k=0;
             if(n!=m) return false;
  
       return (s + s).contains(goal);
    }
}