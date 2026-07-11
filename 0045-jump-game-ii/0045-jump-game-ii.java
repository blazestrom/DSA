class Solution {
    public int jump(int[] nums) {
       int  jump=0;
        int l=0,r=0;
        while(r<nums.length-1){
            int max_jum=0;
            for(int i=l;i<=r;i++){
                max_jum= Math.max(max_jum,i+nums[i]);
            }
            l=r+1;
            r=max_jum;
            jump++;
        }
        return jump;
    }
}