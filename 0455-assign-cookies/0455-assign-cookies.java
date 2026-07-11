class Solution {
    public int findContentChildren(int[] g, int[] s) {
       int  n=g.length;
        int m=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int co=0;
        int chi=0;
        while(co<m && chi<n){
            if(g[chi]<=s[co]){
                chi++;
            }
            co++;
        }
        return chi;
    }
}