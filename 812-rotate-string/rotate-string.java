class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        String ss=s+s;
        int m=goal.length();
             if(n!=m) return false;
  
       return (ss).contains(goal);
    }
}
