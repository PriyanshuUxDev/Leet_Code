class Solution {
    public int maximumProduct(int[] num) {
        int n=num.length;
        if(n==3) return num[0]*num[1]*num[2];
        Arrays.sort(num);
        int op1=num[n-3]*num[n-2]*num[n-1];
        int op2=num[0]*num[1]*num[n-1];
       int maxm=Math.max(op1,op2);
        return maxm;

    }
}