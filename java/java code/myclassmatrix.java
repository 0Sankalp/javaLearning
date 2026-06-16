public class myclassmatrix {
    
  
        public static void main(String args[]) {
          int [][] mat= {{1,2,3},{4,5,6},{7,8,9}};
          
          int row=mat.length;
          int col=mat[0].length;
          int left_sum=0;
          int right_sum=0;
        //   left diognals
        
        System.out.println("Left diognals elements");
        
           for(int i=0;i<row;i++){
               for(int j=0;j<col;j++){
                   if(i==j){
                       System.out.print(mat[i][j]+" ");
                       left_sum+=mat[i][j];
                   }
               }
           }
           System.out.println();
           
             System.out.println("Right  diognals elements");
             
           for(int i=0;i<row;i++){
               for(int j=0;j<col;j++){
                   if(i+j==row-1 && i!=j){
                       System.out.print(mat[i][j]+" ");
                       right_sum+=mat[i][j];
                   }
               }
           }
           System.out.println();
           System.out.println("Diff between summation of leftr_dig and right_dig");
           if(left_sum>right_sum){
               System.out.print(left_sum-right_sum);
           }else{
               System.out.print(right_sum-left_sum);
           }
        }
    }

