class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!= t.length()){
            return false;
        }
        HashMap<Character,Integer> map1= new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char  u= t.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
            map1.put(u,map1.getOrDefault(u,0)-1);
        }
        for(int val : map1.values()){
            if(val!=0) return false;
        }
        return true;
    }
}