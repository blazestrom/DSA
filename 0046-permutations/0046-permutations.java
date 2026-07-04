class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>res= new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        boolean []check = new boolean[nums.length];
        back(nums,res,cur,check);
        return res;
    }
    private void back(int[] nums, List<List<Integer>>res,List<Integer> cur,boolean[]check ){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return ;
        }
        for(int i=0;i<nums.length;i++){
            if(!check[i]){
                check[i]=true;
                cur.add(nums[i]);
                back(nums,res,cur,check);
                cur.remove(cur.size()-1);
                check[i]=false;

            }
        }
    }
}