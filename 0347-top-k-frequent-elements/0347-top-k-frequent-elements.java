class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> count = new HashMap<>();
        List<Integer>[] freq=new ArrayList[nums.length +1];
        for(int i=0;i<freq.length;i++){
            freq[i]=new ArrayList<>();
        }
        for(int n: nums){
            count.put(n,count.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());

        }
        int index=0;
        int []res =new int [k];
        for(int i=freq.length-1;i>0&& index<k;i--){
            for(int e :freq[i]){
                res[index]=e;
                index++;
                if(index==k){
                    return res;
                }
            }

        }
        return res;
    }
}