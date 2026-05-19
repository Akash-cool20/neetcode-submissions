class Solution {
    public void sortColors(int[] nums) {
         int zero_idx = 0, two_idx = nums.length-1, curr = 0;
         while(curr < nums.length && curr <= two_idx && zero_idx < two_idx ){
            if(nums[curr]==2){
                nums[curr] = nums[two_idx];
                nums[two_idx] = 2;
                two_idx--;
            }
            else if(nums[curr] == 0){
                nums[curr] = nums[zero_idx];
                nums[zero_idx] = 0;
                zero_idx++;
                curr++;
            }else{
                curr++;
            }
         }
    }
}