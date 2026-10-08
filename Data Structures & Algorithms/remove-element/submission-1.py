class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i = 0
        size = len(nums)
        while i < size and nums[i] != val :
            i += 1
        
        j = i+1

        while j < size and nums[j] == val :
            j += 1

        while j < size :
            temp = nums[i]
            nums[i] = nums[j]
            nums[j] = temp
            i += 1
            j += 1
            while j < size and nums[j] == val:
                j += 1 
            
        return i
