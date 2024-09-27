import java.io.*;  
import java.util.Scanner;  
import java.lang.*;  

public class squarePyramid {
    
  
    /* Driver Code */  
    public static void main(String[] args)  
    {  
        double s;  
        int n=5;  
        /* Formula to calculate square pyramidal number. */  
        s=(n*(n+1)*(2*n+1))/6;  
        System.out.println("Square Pyramidal Number at position " + n + " = "+s);  
    }  
}  
    

