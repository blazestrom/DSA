class Solution {
    public List<Integer> diffWaysToCompute(String expression) {
        int n= expression.length();
        return rec(expression,0,n-1);
    }
    private List<Integer> rec( String s,int start,int end){
        List<Integer> result= new ArrayList<>();

        if(start== end ){
            int num= s.charAt(start)-'0';
            result.add(num);
            return result;
        }
        if(end-start==1 && Character.isDigit(s.charAt(start))){
           int num1 = s.charAt(start)-'0'; 
            int num2 = s.charAt(end)-'0';
            result.add(num1*10+num2);
            return result;
            
        }
        for(int i=start;i<=end ;i++){
            if(Character.isDigit(s.charAt(i))){
                continue;
            }
            List<Integer>left= rec(s,start,i-1);
            List<Integer>right=rec(s,i+1,end);

            for( int l:left){
                for(int r:right){
                    char c=s.charAt(i);
                    if(c=='*'){
                        result.add(l*r);
                    }
                    else if(c=='+'){
                        result.add(r+l);
                    }
                    else 
                        result.add(l-r);
                }
            }
        }
        return result;
    }
}