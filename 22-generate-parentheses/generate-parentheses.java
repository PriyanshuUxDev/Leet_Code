class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ans =new ArrayList<>();
       String word="";
       genPara( n,0,0,ans,word);
       return ans;

    }

    public void genPara(int n,int open,int close,List<String> ans,String word){
        if(open==n && close ==n){
            ans.add(word);
            return;

        }
        if(open>n|| close>n) return;
        if(open<n ){
             genPara( n,open+1,close,ans,word+"(");
        }
        if(close<n&& close<open){
             genPara( n,open,close+1,ans,word+")");
        }

    }
}