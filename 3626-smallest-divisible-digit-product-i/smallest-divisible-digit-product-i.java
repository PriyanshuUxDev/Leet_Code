class Solution {
    public int smallestNumber(int n, int t) {
         if(t==1) return n;
         if(n==1) return t;


         int pro=1;
         while(pro%t!=0){
            pro=1;
         int dig=0;
            int nn=n;
            while(nn>0){
                dig=nn%10;
                pro=pro*dig;
                nn=nn/10;
            }
            n++;
         }
        return n-1;
    }
}