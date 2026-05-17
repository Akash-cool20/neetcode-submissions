class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        int min_idx = 0;
        
        if(strs[0].length()==0)
            return "";
        
        char c = strs[0].charAt(0);
        
        for(int i=0;i<strs.length;i++){
            if(strs[i].length() == 0 || strs[i].charAt(0)!=c)
                return "";
            if(min > strs[i].length()){
                min = strs[i].length();
                min_idx = i;
            }
        }
        
        String ans = strs[min_idx].substring(0,min);
        
        int j = min;
        
        for(int i=0;i<strs.length;i++){
                while(j>1 && !strs[i].startsWith(ans)){
                    j--;
                    ans = ans.substring(0,j);
                }
                if(j==1)
                    break;
        }
        return ans;

    }
}