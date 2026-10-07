class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        temp = strs[0]
        size = len(temp)
    
        for i in range(len(strs) - 1):
            while size != 0 and  (strs[i+1].find(temp) == -1) :
                size = size - 1 
                temp = temp[:size]
            if size == 0:
                return ""
        return temp

        