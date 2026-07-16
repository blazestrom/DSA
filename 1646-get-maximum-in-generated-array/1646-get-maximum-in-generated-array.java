class Solution {
    public int getMaximumGenerated(int n) {
        if(n==1)return 1;
        if(n==0)return 0;
        int num[]= new int [n+1];
        num[0]=0;
        num[1]=1;
        for(int i=1;i<=n/2;i++){
            if(i*2<=n){
            num[(i*2)]=num[i];
            }
            if(2*i+1<=n){
            num[(i*2)+1]=num[i]+num[i+1];
        }
        }
        int man=1;
        for(int i=1;i<n+1;i++){
            if(num[i]>man){
                man=num[i];
            }
        }
        return man;
        
    }
}