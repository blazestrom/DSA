class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        back(0,s,res,new ArrayList<>());
        return res;
    }
    private void back( int index,String s,List<List<String>> res,List<String>cur){
        if(index == s.length()){
            res.add(new ArrayList<>(cur));
            return;
        }
        for (int end = index;end<s.length();end++){
            String part= s.substring(index,end+1);
            if(palin(part)){
                cur.add(part);
                back(end+1,s,res,cur);
                cur.remove(cur.size()-1);
            }
        }

    }
    private boolean palin(String s){
     
    
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
            return false;    
            }
            
            i++;
            j--;
        }
        return true;
    }
}