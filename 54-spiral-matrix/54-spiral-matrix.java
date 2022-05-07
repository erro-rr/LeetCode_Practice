class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result=new ArrayList<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
       int top=0;
        int left=0;
        int right=n-1;
        int down=m-1;
       
    /*    while(true){
            //left to right
            for(int i=left;i>=right;i++){
                result.add(matrix[top][i]);
                top++;
                if(left>right&&top>down)
                    break;
            }
            // up to down
            for(int i=top;i>=down;i++){
                result.add(matrix[i][right]);
                right--;
                if(left>right&&top>down)
                    break;
            }
            for(int i=right;i>left;i--){
                result.add(matrix[down][i]);
                down--;
             if(left>right&&top>down)
                    break;
            }
            for(int i=down;i>=top;i--){
                result.add(matrix[i][left]);
                left++;
             if(left>right&&top>down)
                    break;
            }
    }
        
        */
        
        int dir=0;
        while(top<=down&& left<=right){
            if(dir==0){
                for(int i=left;i<=right;i++){
                    result.add(matrix[top][i]);
                }
                top++;
            }
           else if(dir==1){
                for(int i=top;i<=down;i++){
                    result.add(matrix[i][right]);
                }
               right--;
            }
          else if(dir==2){
                for(int i=right;i>=left;i--){
                    result.add(matrix[down][i]);
                    }
              down--;
          }
           else if(dir==3){
                        for(int i=down;i>=top;i--){
                            result.add(matrix[i][left]);
                        }
                        left++;
                    }
            dir=(dir+1)%4;
            }
        return result;
        
}
}