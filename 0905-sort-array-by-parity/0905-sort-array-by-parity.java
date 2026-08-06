class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n= nums.length;
        int i=0;
        int j=n-1;
        int []arr= new int [n];
        for(int num:nums){
            if(num%2==0){
                arr[i++]=num;
            }
            else{
                arr[j--]=num;
            }
        }
        return arr;
    }
}