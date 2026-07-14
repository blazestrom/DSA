class Solution {
    int drow[]={-1,0,1,0};
    int dcol[]={0,+1,0,-1};
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int [][] visit= new int [n][m];
        for(int i=0;i<m;i++){
            if(visit[0][i]==0&&grid[0][i]==1 ){
                dfs(0,i,visit,grid);
            }
            if(visit[n-1][i]==0&&grid[n-1][i]==1 ){
                dfs(n-1,i,visit,grid);
            }
        }
        for(int j=0;j<n;j++){
            if(visit[j][0]==0&&grid[j][0]==1 ){
                dfs(j,0,visit,grid);
            }
            if(visit[j][m-1]==0&&grid[j][m-1]==1 ){
                dfs(j,m-1,visit,grid);
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if( visit[i][j]==0 && grid[i][j]==1){
                    count++;
                }
            }
        }


     return count;   
    }
    private void dfs(int row ,int col,int [][]visit,int [][]grid){
        visit[row][col]=1;
        int n=grid.length;
        int m= grid[0].length;

        for(int i=0;i<4;i++){
            int nrow= row+drow[i];
            int ncol= col+dcol[i];
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&visit[nrow][ncol]==0&&grid[nrow][ncol]==1){
                dfs(nrow,ncol,visit,grid);
            }
        }

    }
}