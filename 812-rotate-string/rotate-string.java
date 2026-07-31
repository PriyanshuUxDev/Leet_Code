class Solution {
    public boolean rotateString(String s, String goal) {
        int n=s.length();
        String ss=s+s;
        int nn=ss.length();
        int m=goal.length();
        int i=0;
        int k=0;
             if(n!=m) return false;
        //     char st=ss.charAt(i);
        //     char end=goal.charAt(k);
       
        // while(st!=end && i<nn && k<m ){
        //      st=ss.charAt(i);
        //      end=goal.charAt(k);
            
        //         i++;
            
        // }
        // if(i>=nn || j>=nn ) return false;
        // while(i<nn && k<m){
        //        st=ss.charAt(i++);
            
        //      end=goal.charAt(k++);
        //     if(st!=end) return false;
        // }
       return (s + s).contains(goal);
    }
}