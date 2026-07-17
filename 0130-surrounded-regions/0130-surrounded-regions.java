class Solution {
    int drow[]={+1,0,-1,0};
    int dcol[]={0,+1,0,-1};
    public void solve(char[][] board) {
        int n= board.length;
        int m=board[0].length;
        int [][] visit= new int[n][m];
       
        for(int i=0;i<m;i++){
            if(board[0][i]=='O'&& visit[0][i]==0){
                back(0,i,board,visit);
            }
            if(board[n-1][i]=='O'&& visit[n-1][i]==0){
                back(n-1,i,board,visit);
            }
            
        }
        for(int i=0;i<n;i++){
            if(board[i][0]=='O'&& visit[i][0]==0){
                back(i,0,board,visit);
            }
            if(board[i][m-1]=='O'&& visit[i][m-1]==0){
                back(i,m-1,board,visit);
            }
        }

        for( int i=0;i<n;i++){
            for( int j=0;j<m;j++){
                if(visit[i][j]==0 && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    private void back(int row,int col,char [][]board,int [][]visit){
        visit[row][col]=1;
        
        int n=board.length;
        int m=board[0].length;
        for(int i=0;i<4;i++){
            int nr=row+drow[i];
            int nc=col+dcol[i];
            if(nr<n && nr>=0 && nc<m && nc>=0 && visit[nr][nc]==0 && board[nr][nc]=='O'){
                back(nr,nc,board,visit);
            }
        }
    }
}