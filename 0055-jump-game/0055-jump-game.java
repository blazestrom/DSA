class Solution {
    public boolean canJump(int[] nums) {
        int max_in=0;
        for(int i=0;i<nums.length;i++){
            if(i>max_in){
                return false;
            }
            max_in=Math.max(max_in,i+nums[i]);
        }
        return true;
    }
}