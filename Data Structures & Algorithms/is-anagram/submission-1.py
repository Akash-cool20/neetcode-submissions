class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
       
        if len(s) != len(t):
            return False
        
        list_size = 26
        char_array = [0] * list_size

        for i in range(len(s)):
            index1 = ord(s[i]) - ord('a')
            index2 = ord(t[i]) - ord('a')

            char_array[index1] += 1
            char_array[index2] -= 1

        for char in char_array:
            if char != 0 :
                return False
        return True

        
         
        