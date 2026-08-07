class Solution {
    public int maxSubArray(int[] nums) {
        int cursum=0;
        int maxs= Integer.MIN_VALUE;
        for(int n:nums){
            cursum=cursum+n;
            if(cursum>maxs){
                maxs=cursum;
            }
            if(cursum<0){
                cursum=0;
            }
        }
        return maxs;
    }
}