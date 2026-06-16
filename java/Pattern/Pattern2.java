package Pattern;

public class Pattern2 {
  
    public static void main(String args[]) {
        int n=5;
       for(int i=0;i<n;i++)
     {
         for(int j=i;j<=2*i;j++)
            {
                System.out.print((char)(j+65)+" ");
            }
         System.out.println();
     }
    }
}
    
