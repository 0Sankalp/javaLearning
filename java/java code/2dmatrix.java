public class 2dmatrix {
    
        public static void main(String args[]) {
          int [][] arr= {{1,2,3,4},{4,5,6,7},{7,8,9,10}};
        //   System.out.println(arr.length);
        //   System.out.println(arr[0].length);
        
        int row=arr.length;
        int col=arr[0].length;
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        }
    }
    
