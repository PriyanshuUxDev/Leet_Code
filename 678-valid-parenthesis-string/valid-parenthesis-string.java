class Solution {
    public boolean checkValidString(String s) {
       int min=0;
       int max=0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '('){

                max++;
                min++;
            }
            else if (ch == '*'){
                
                min--;
                max++;
            }
            else {
               max--;
               min--;
            }


            if(max<0) return false;
            if(min<0) min=0;
        }

       

        
        return min==0;

    }

}