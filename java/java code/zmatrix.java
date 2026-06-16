public class zmatrix {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{4,5,6,7}{6,7,8,9}};
        int row=arr.lenght;
        int col=arr[0].lenght;

        //firts row
        int i=0;
        for(int j=0;j<col-1; j++){
            System.out.print(arr[i][j]+" ");
        }
        //right dig

        for(int m=0;m<row-1;m++){
            for(int n=0;n<row; n++){
                if(m+n==row-1){
                    System.out.print(arr[m][n]+" ");
                }
            }
        }
        // last row
        i=row-1;
        for(int j=0;j<row;j++){
            System.out.print(arr[i][j]+" ");
        }
    
}
}
