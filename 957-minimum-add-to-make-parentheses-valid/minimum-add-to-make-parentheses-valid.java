class Solution {
    public int minAddToMakeValid(String s) {

        int  open=0;
        int close=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
                open++;
            }else{
                if(open>0){
                    open--;
                }else{

                close++;
                }
            }
        }
        return open+close;
       
    }
}