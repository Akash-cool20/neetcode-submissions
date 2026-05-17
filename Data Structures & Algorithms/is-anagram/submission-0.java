class Solution {
    public boolean isAnagram(String s, String t) {
        int []alpha = new int[26];
        if(s.length()!=t.length())
            return false;
        for(int i = 0;i<s.length();i++){
              alpha[s.charAt(i)-97]++;
        }
        for(int i = 0;i<t.length();i++){
            alpha[t.charAt(i)-97]--;
            if(alpha[t.charAt(i)-97] < 0)
                return false;
        }
        return true;
    }
}
