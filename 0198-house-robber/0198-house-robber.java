class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int []dp = new int [n];
        Arrays.fill(dp,-1);
        return ro(n-1,nums,dp);
        
    }
    private int ro(int index,int[] arr,int[]dp)
    {
        if(index==0) return arr[index];
        if(index<0) return 0;
        if(dp[index]!=-1) return dp[index];
        int left = arr[index]+ro(index-2,arr,dp);
        int right = 0+ro(index-1,arr,dp);
        return dp[index]=Math.max(left,right);

    }
}
