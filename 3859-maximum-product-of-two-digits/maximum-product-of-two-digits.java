class Solution {
    public int maxProduct(int m) {
        int n=m;
        int k=m;
        int m1=0;
        int m2=0;
        int i=0;
         int ii=0;

        while(n>0){
            i++;
            int dig=n%10;
            if(m1<dig){
                m1=Math.max(dig,m1);
                ii=i;
            }
            n=n/10;
        }
        int j=0;
        while(k>0){
            j++;
            int dig=k%10;
            if(m2<dig && j!=ii){
                m2=Math.max(dig,m2);
            }
            k=k/10;
        }
        return m1*m2;  
    }
}