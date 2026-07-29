class Solution {
    public long sumAndMultiply(int n) {
        String str = String.valueOf(n);
        if(n==0) return 0;
        String s="";
        int sum=0;
        for(int i=0;i<str.length();i++){
              int d=n%10;
                 sum+=d;
                 n=n/10;
            if(str.charAt(i)!='0'){
                s=s+str.charAt(i);
            }
        }
        int x = Integer.parseInt(s);
        return (long)x*sum;
    }
}