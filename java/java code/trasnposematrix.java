public class trasnposematrix {
   
        public static void main(String args[]) {
          int [][] arr={{1,2,3},{4,5,6},{7,8,9}};
          int row= arr.length;
          int col=arr[0].length;
          int [][]arr2=new int[row][col];
          
          for(int i=0;i<arr.length;i++){
              for(int j=0;j<arr.length;j++){
                  arr2[i][j]=arr[j][i];
                  System.out.print(arr2[i][j]+" ");
              }
              System.out.println();
          }
        //   for(int i=0;i<arr2.length;i++){
        //       for(int j=0;j<arr2.length;j++){
        //          System.out.print(arr2[i][j]+" ");
        //       }
        //       System.out.println();
        //   }
        }
    }
    

