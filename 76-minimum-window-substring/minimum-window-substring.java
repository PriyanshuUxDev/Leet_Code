class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        int[] freq = new int[62];
        if (n < m)
            return "";
        for (char v : t.toCharArray()) {
            freq[v - 'A']++;
        }
        int i = 0;
        int cnt = 0;
        String result = "";
         int minLen = Integer.MAX_VALUE;

        for (int j = 0; j < n; j++) {
            char right = s.charAt(j);
            char left = s.charAt(i);
            freq[right - 'A']--;
            if (freq[right - 'A'] >= 0) {
                cnt++;
            }
            while (cnt == m ) {
                int curr=j-i+1;
                if(minLen>curr){
                    minLen=curr;
                     result = s.substring(i, j + 1);
                }
                right = s.charAt(j);
                left = s.charAt(i);
                freq[left - 'A']++;
                if (freq[left - 'A'] > 0) {
                    cnt--;
                //   result = s.substring(i, j + 1);
                }
                i++;
            }
        }
        return result;

    }
}