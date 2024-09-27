import java.util.*;  

public class pyramidNuber {
   
  
 /* Function to check whether the number is a Pyramidal number. */  
    static int findPyramid(int s)  
    {  
        int sum = 0;  
  
        /* Add squares of the numbers from 1. */  
        for (int n = 1; sum < s; n++)  
        {  
            sum += n * n;  
  
            /* If sum becomes equal to s return n. */  
            if (sum == s)  
                return n;  
        }  
  
        return -1;  
    }  
  
    /* Driver code */  
    public static void main(String ar[])  
    {  
        /* Instance creation of Scanner class */  
        Scanner in = new Scanner(System.in);  
        System.out.print("Enter a number: ");  
        int s=in.nextInt();  
        int n = findPyramid(s);  
        if (n == -1)  
            System.out.println("-1");  
        else  
            System.out.println("Position of Pyramidal number " + s + " is: " + n);  
    }  
} 


    

