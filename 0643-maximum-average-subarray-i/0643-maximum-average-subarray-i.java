class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        double maxavg=(double)sum/k;
        int h=k;
        int i=0;
        double curavg=0;
        while(h<n){
            sum=sum-nums[i++]+nums[h++];
            curavg=(double)sum/k;
            maxavg=Math.max(curavg,maxavg);
        }
        return maxavg;

    }
}