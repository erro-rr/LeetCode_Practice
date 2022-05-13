class Solution {
     int[][] dir={{-1,-1},{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1}};
    public void gameOfLife(int[][] board) {
       
        int m=board.length,n=board[0].length;
        int [][] result=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int count=0;
                for(int[] d:dir){
                    int p=i + d[0];
                    int q=j + d[1];
                    if(p>=0 && p<m && q>=0 && q<n && board[p][q]==1){
                        count ++;
                    }
                }
                if(board[i][j]==1){
                    if(count<2)
                    {result[i][j]=0;}
                    if(count==2|| count==3)
                    {  result[i][j]=1;}
                    if(count>3)
                    { result[i][j]=0;}
                }
                else{
                    if(count==3)
                    {result[i][j]=1;}
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=result[i][j];
            }
        }
    }
}