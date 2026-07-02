class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        String result="";
        for(char c:s.toCharArray()){
            if(stack.isEmpty()){
                    stack.push(c);

            }else  {
                if(c!=')'){
                        stack.push(c);
                        result+=c;
                }else{
                    stack.pop();
                    if(!stack.isEmpty()){
                        result+=c;
                    }
                }

            }
        }
        return result;
        
    }
}