class Solution {
    public int majorityElement(int[] nums) {
        int  can=nums[0],vote=1;
        for(int i=1;i< nums.length;i++){
            if(can == nums[i]){
                vote++;
            }
            else{
                vote--;
            }
            if(vote < 0)
                can = nums[i];
        }
        return can;
    }
}