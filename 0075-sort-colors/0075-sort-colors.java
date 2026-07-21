class Solution {
    public void sortColors(int[] nums) {
        int freq[]=new int [3];
        for(int num:nums){
            freq[num]++;
        }
        int index=0;
        for(int color =0;color<3;color++){
            for(int i=0;i<freq[color];i++){
                nums[index++]=color;
            }
        }
        
    }
}