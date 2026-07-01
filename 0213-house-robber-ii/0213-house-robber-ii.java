class Solution {
    public int rob(int[] nums) {
        int ne= nums.length;
        if(ne==1) return nums[0];
        return Math.max(ro(nums,0,ne-2),ro(nums,1,ne-1));
    }
    private int ro( int[] num,int start,int end){
        
        int prev=num[start];
        int prev2=0;
        for(int i=start+1;i<=end;i++){
            int take = num[i];
             if (i > start + 0) take += prev2;
            int n_take= 0+prev;
            int cur = Math.max(take,n_take);
            prev2=prev;
            prev=cur;
            
        }
        return prev;
    }
}