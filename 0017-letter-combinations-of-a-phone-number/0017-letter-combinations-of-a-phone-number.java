class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits.length()==0)return res;
        HashMap<Character,String> map = new HashMap<>();
        StringBuilder cur = new StringBuilder();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        back(0,digits,map,res,cur);
        return res;
    }
    private void back(int index,String digit,HashMap<Character,String> map,List<String> res,StringBuilder cur){
        if (index == digit.length()){
            res.add(cur.toString());
            return ;

        }
        char num = digit.charAt(index);
        String str= map.get(num);
        for(int i=0;i<str.length();i++){
            cur.append(str.charAt(i));
            back(index+1,digit,map,res,cur);
            cur.deleteCharAt(cur.length()-1);
        }
        

        }

    }
